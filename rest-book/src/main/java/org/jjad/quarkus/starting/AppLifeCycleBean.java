package org.jjad.quarkus.starting;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

import java.util.logging.Logger;

@ApplicationScoped
public class AppLifeCycleBean {
    private static final Logger log = Logger.getLogger(ApplicationScoped.class.getName());

    void onStart(@Observes StartupEvent startupEvent){
        log.info("onStart method of application");
    }

    void onShutdown(@Observes ShutdownEvent shutdownEvent){
        log.info("onShutdown method of application");
    }
}
