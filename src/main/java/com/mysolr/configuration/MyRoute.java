package com.mysolr.configuration;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        restConfiguration().component("servlet").bindingMode(RestBindingMode.json)
                .dataFormatProperty("prettyPrint", "true")
                .contextPath("camel-example-servlet-rest-tomcat/rest");

        rest("/say").get("/hello").to("direct:hello");

        from("direct:hello")
                .transform()
                .constant("Hello World !!")     ;
    }
}
