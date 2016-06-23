package com.ap.newsdatabaserest.rest.proxy;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import org.jboss.resteasy.specimpl.ResponseBuilderImpl;

/**
 *
 * @author A.P.Rajshekhar
 */
public class BaseProxy {
    
    public BaseProxy() {
    }
    
    protected Response createResponse(Object object, Status status){
        return addHeader(status).entity(object).build();
    }

    protected Response.ResponseBuilder addHeader(Status status) {
        ResponseBuilder builder = new ResponseBuilderImpl();
        builder.header("Content-Type", MediaType.APPLICATION_JSON);
        builder.status(Status.CREATED);
        return builder;
    }
}
