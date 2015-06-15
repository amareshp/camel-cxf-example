package com.visitamaresh.ws.demo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CamelRouteProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("In camel processor...");
    }

}
