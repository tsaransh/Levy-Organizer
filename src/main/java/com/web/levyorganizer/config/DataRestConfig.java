package com.web.levyorganizer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import javax.persistence.EntityManager;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {

    private EntityManager entityManager;

    @Value("${allowed.origins}")
    private String theAllowedOrigins[];

    @Autowired
    public DataRestConfig(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        cors.addMapping(config.getBasePath()+"/**").allowedOrigins(theAllowedOrigins);
    }

}
