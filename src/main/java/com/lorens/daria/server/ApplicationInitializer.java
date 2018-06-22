package com.lorens.daria.server;

import com.lorens.daria.server.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {

    private final static String DISPATCHER = "dispatcher";

    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener(ctx));

        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet(DISPATCHER, new DispatcherServlet(ctx));
        servletRegistration.addMapping("/");
        servletRegistration.setLoadOnStartup(1);
    }
}
