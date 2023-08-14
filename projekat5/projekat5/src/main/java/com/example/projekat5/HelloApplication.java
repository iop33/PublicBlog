package com.example.projekat5;

import com.example.projekat5.repositories.ArticleImplementation;
import com.example.projekat5.repositories.ArticleRepository;
import com.example.projekat5.servicies.ArticleService;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class HelloApplication extends ResourceConfig {
    public HelloApplication(){
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);

        AbstractBinder binder = new AbstractBinder() {
            @Override
            protected void configure() {
                this.bind(ArticleImplementation.class).to(ArticleRepository.class).in(Singleton.class);

                this.bindAsContract(ArticleService.class);


            }
        };
        register(binder);
        packages("com.example.projekat5.resources");
    }

}