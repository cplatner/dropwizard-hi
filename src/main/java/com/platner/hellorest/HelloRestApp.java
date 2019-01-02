package com.platner.hellorest;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import com.platner.hellorest.resources.HelloRestResource;
import com.platner.hellorest.health.TemplateHealthCheck;

public class HelloRestApp extends Application<HelloRestConfig> {
    public static void main(String[] args) throws Exception {
        new HelloRestApp().run(args);
    }

    @Override
    public String getName() {
        return "hello-rest";
    }

    @Override
    public void initialize(Bootstrap<HelloRestConfig> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(HelloRestConfig configuration, Environment environment)
    {
        final HelloRestResource resource = new HelloRestResource(
            configuration.getTemplate(),
            configuration.getDefaultName());
        environment.jersey().register(resource);

        final TemplateHealthCheck healthCheck =
            new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
    }
}
