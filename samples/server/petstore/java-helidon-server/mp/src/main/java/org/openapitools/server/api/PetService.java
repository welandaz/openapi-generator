/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.api;

import java.io.File;
import org.openapitools.server.model.ModelApiResponse;
import org.openapitools.server.model.Pet;
import java.util.Set;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen")
public interface PetService {

    @POST
    @Path("/pet")
    @Consumes({ "application/json", "application/xml" })
    abstract Response addPet(@Valid @NotNull Pet pet);

    @DELETE
    @Path("/pet/{petId}")
    abstract Response deletePet(@PathParam("petId") Long petId, @HeaderParam("api_key")  String apiKey);

    @GET
    @Path("/pet/findByStatus")
    @Produces({ "application/xml", "application/json" })
    abstract Response findPetsByStatus(@QueryParam("status") @NotNull List<String> status);

    @GET
    @Path("/pet/findByTags")
    @Produces({ "application/xml", "application/json" })
    abstract Response findPetsByTags(@QueryParam("tags") @NotNull Set<String> tags);

    @GET
    @Path("/pet/{petId}")
    @Produces({ "application/xml", "application/json" })
    abstract Response getPetById(@PathParam("petId") Long petId);

    @PUT
    @Path("/pet")
    @Consumes({ "application/json", "application/xml" })
    abstract Response updatePet(@Valid @NotNull Pet pet);

    @POST
    @Path("/pet/{petId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    abstract Response updatePetWithForm(@PathParam("petId") Long petId, @FormParam(value = "name")  String name, @FormParam(value = "status")  String status);

    @POST
    @Path("/pet/{petId}/uploadImage")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    abstract Response uploadFile(@PathParam("petId") Long petId, @FormParam(value = "additionalMetadata")  String additionalMetadata,  @FormParam(value = "file") InputStream _fileInputStream);

    @POST
    @Path("/fake/{petId}/uploadImageWithRequiredFile")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    abstract Response uploadFileWithRequiredFile(@PathParam("petId") Long petId,  @FormParam(value = "requiredFile") InputStream requiredFileInputStream, @FormParam(value = "additionalMetadata")  String additionalMetadata);
}
