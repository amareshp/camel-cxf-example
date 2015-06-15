package com.visitamaresh.ws.demo;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

/**
 * Define REST services using the Camel REST DSL
 */
public class CamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        restConfiguration().component("servlet").bindingMode(RestBindingMode.json)
        // and output using pretty print
        .dataFormatProperty("prettyPrint", "true")
        // setup context path and port number that Apache Tomcat will deploy
        // this application with, as we use the servlet component, then we
        // need to aid Camel to tell it these details so Camel knows the url
        // to the REST services.
        // Notice: This is optional, but needed if the RestRegistry should
        // enlist accurate information. You can access the RestRegistry
        // from JMX at runtime
        .contextPath("camel-cxf-example/camel").port(8080);        
        // this user REST service is json only
        rest("/user").description("User rest service")
            .consumes("application/json").produces("application/json")

            .get("/{id}").description("Find user by id").outType(User.class)
                .to("bean:userService?method=getUser(${header.id})")

            .put().description("Updates or create a user").type(User.class)
                .to("bean:userService?method=updateUser")

            .get("/findAll").description("Find all users").outTypeList(User.class)
                .to("bean:userService?method=listUsers");
        //camel route example
        from("cxf:bean:routerEndpoint").process(new CamelRouteProcessor()).to("file:/Users/apatta2/MyData/temp");
    }

}