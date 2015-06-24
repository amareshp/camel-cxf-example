package com.va.ws.camel.cxf.hello;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

public class HelloRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

     getContext().setTracing(true);

     from("jetty:http://localhost:8032?matchOnUriPrefix=true")
       .to("cxfbean:helloService?providers=jsonProvider");
    }

   }
