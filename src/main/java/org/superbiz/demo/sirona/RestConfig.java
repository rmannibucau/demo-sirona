package org.superbiz.demo.sirona;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>() {{
            add(AJAXRSService.class);
        }};
    }
}
