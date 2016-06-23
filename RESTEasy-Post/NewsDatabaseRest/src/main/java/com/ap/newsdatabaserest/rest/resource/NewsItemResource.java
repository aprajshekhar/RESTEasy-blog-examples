package com.ap.newsdatabaserest.rest.resource;

import com.ap.newsdatabaserest.model.NewsItem;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author A.P.Rajshekhar
 */
@Path("/news_items")
public interface NewsItemResource {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response add(NewsItem item);
}
