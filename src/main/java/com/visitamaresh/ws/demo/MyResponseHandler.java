package com.visitamaresh.ws.demo;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.ResponseHandler;
import org.apache.cxf.jaxrs.model.OperationResourceInfo;
import org.apache.cxf.message.Message;

public class MyResponseHandler implements ResponseHandler {

    @Override
    public Response handleResponse(Message m, OperationResourceInfo ori, Response response) {
        System.out.println("In response handler...");
        return null;
    }

}
