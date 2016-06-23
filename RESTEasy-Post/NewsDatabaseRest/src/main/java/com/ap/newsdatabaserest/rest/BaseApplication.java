package com.ap.newsdatabaserest.rest;

import java.util.Collections;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author A.P.Rajshekhar
 */
@ApplicationPath("/rest")
public class BaseApplication extends Application{
    @Override
    public Set<Class<?>> getClasses(){
        return Collections.EMPTY_SET;
    }
    
}
