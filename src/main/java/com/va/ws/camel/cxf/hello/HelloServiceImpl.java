package com.va.ws.camel.cxf.hello;

import javax.ws.rs.core.Response;

import com.visitamaresh.ws.demo.User;

public class HelloServiceImpl implements HelloService {
    private String xmlResponse = "Hello Amaresh!";

    @Override
    public Response hello(String name) {
        System.out.println("hello service called.");
        User user = new User();
        Response r = Response.status(200).entity(user).build();
        return r;
    }
}
