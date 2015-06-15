package com.visitamaresh.ws.demo;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class CamelRouteProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("In camel processor...");
        String output = "This is being printed from the processor...";
        Message out = exchange.getOut();
        out.setBody(output);
        out.setHeader(org.apache.cxf.message.Message.RESPONSE_CODE, new Integer(200));
    }

}
