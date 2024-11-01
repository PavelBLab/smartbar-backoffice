package com.quarkus.smartbackoffice.provider.controllers;

import com.quarkus.smartbackoffice.provider.models.CategoryDto;

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
@Path("/categories")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-01T19:14:50.753222+01:00[Europe/Amsterdam]", comments = "Generator version: 7.8.0")
public interface CategoriesApi {

    /**
     * 
     *
     * @return List of categories
     */
    @GET
    @Produces({ "application/json" })
    Response allCategories();


    /**
     * 
     *
     * @param categoryDto 
     * @return Category created successfully
     */
    @POST
    @Consumes({ "application/json" })
    Response createCategory(@Valid @NotNull CategoryDto categoryDto);


    /**
     * 
     *
     * @param id Unique ID
     * @return Category deleted successfully
     */
    @DELETE
    @Path("/{id}")
    Response deleteCategory(@PathParam("id") Long id);


    /**
     * 
     *
     * @param id Unique ID
     * @return Category details
     */
    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    Response oneCategory(@PathParam("id") Long id);


    /**
     * 
     *
     * @param id Unique ID
     * @param categoryDto 
     * @return Category updated successfully
     */
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    Response updateCategory(@PathParam("id") Long id,@Valid @NotNull CategoryDto categoryDto);

}
