package com.quarkus.smartbackoffice.provider.controllers;

import com.quarkus.smartbackoffice.provider.models.ArticleDto;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/articles")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-01T19:22:24.263246+01:00[Europe/Amsterdam]", comments = "Generator version: 7.8.0")
public interface ArticlesApi {

    /**
     * 
     *
     * @return List of articles
     */
    @GET
    @Produces({ "application/json" })
    Response allArticles();


    /**
     * 
     *
     * @param xCategoryId 
     * @param articleDto 
     * @return Article created successfully
     */
    @POST
    @Consumes({ "application/json" })
    Response createArticle(@HeaderParam("x-category-id") @NotNull   Long xCategoryId,@Valid @NotNull ArticleDto articleDto);


    /**
     * 
     *
     * @param id Unique ID
     * @return Article deleted successfully
     */
    @DELETE
    @Path("/{id}")
    Response deleteArticle(@PathParam("id") Long id);


    /**
     * 
     *
     * @param id Unique ID
     * @return Article details
     */
    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    Response oneArticle(@PathParam("id") Long id);


    /**
     * 
     *
     * @param id Unique ID
     * @param articleDto 
     * @return Article updated successfully
     */
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    Response updateArticle(@PathParam("id") Long id,@Valid @NotNull ArticleDto articleDto);

}
