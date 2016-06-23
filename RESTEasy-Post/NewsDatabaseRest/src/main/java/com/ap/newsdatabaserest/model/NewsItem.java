package com.ap.newsdatabaserest.model;

import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author A.P.Rajshekhar
 */
@Data
public class NewsItem {
    @Getter @Setter @NotNull
    private int id;
    
    @Getter @Setter @NotNull
    private String headline;
    
    private String body;
    
    @Getter @Setter @NotNull
    private String author;
    
}
