package com.va.ws.camel.cxf.hello;

import javax.ws.rs.core.Response;

public class HelloServiceImpl implements HelloService {

    public Response hello() {
        return Response.ok("Hello from camel...").build();
    }

    @Override
    public Response hello(String name) {
        return Response.ok("Hello " + name + " - from camel...").build();
    }
}
