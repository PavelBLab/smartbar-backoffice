package com.quarkus.smartbackoffice.provider.controllers;

import com.quarkus.smartbackoffice.provider.models.TableDto;

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
@Path("/tables")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-01T19:22:24.263246+01:00[Europe/Amsterdam]", comments = "Generator version: 7.8.0")
public interface TablesApi {

    /**
     * 
     *
     * @return List of tables
     */
    @GET
    @Produces({ "application/json" })
    Response allTables();


    /**
     * 
     *
     * @param tableDto 
     * @return Table created successfully
     */
    @POST
    @Consumes({ "application/json" })
    Response createTable(@Valid @NotNull TableDto tableDto);


    /**
     * 
     *
     * @param id Unique ID
     * @return Table deleted successfully
     */
    @DELETE
    @Path("/{id}")
    Response deleteTable(@PathParam("id") Long id);


    /**
     * 
     *
     * @param id Unique ID
     * @return Table details
     */
    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    Response oneTable(@PathParam("id") Long id);


    /**
     * 
     *
     * @param id Unique ID
     * @param tableDto 
     * @return Table updated successfully
     */
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    Response updateTable(@PathParam("id") Long id,@Valid @NotNull TableDto tableDto);

}
