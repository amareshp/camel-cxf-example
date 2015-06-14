package com.visitamaresh.ws.demo;

import java.util.Set;

import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

import org.apache.camel.builder.RouteBuilder;
import org.apache.cxf.message.Exchange;

public class CamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        // Defines the starting endpoint as the Spring bean jxRsServer (in
        // applicationContext.xml)
        System.out.println("In the camel router section...");
    }
}