package com.visitamaresh.ws.demo;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.RequestHandler;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.message.Message;

public class MyRequestHandler implements RequestHandler{

    @Override
    public Response handleRequest(Message m, ClassResourceInfo resourceClass) {
        System.out.println("In request handler...");
        return null;
    }

}
