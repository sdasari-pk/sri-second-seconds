/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import com.prokarma.pkmst.model.ModelApiResponse;
import com.prokarma.pkmst.model.Pet;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for PetApi
 */
@Ignore
public class PetApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final PetApi api = new PetApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Add a new pet to the store
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addPetTest() throws Exception {
        Pet body = null;
    ResponseEntity<Void> response = api.addPet(body , accept);

        // TODO: test validations
    }
    
    /**
     * Deletes a pet
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePetTest() throws Exception {
        Long petId = null;
        String apiKey = null;
    ResponseEntity<Void> response = api.deletePet(petId, apiKey , accept);

        // TODO: test validations
    }
    
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findPetsByStatusTest() throws Exception {
        List<String> status = null;
    ResponseEntity<List<Pet>> response = api.findPetsByStatus(status , accept);

        // TODO: test validations
    }
    
    /**
     * Finds Pets by tags
     *
     * Muliple tags can be provided with comma separated strings. Use         tag1, tag2, tag3 for testing.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void findPetsByTagsTest() throws Exception {
        List<String> tags = null;
    ResponseEntity<List<Pet>> response = api.findPetsByTags(tags , accept);

        // TODO: test validations
    }
    
    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPetByIdTest() throws Exception {
        Long petId = null;
    ResponseEntity<Pet> response = api.getPetById(petId , accept);

        // TODO: test validations
    }
    
    /**
     * Update an existing pet
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePetTest() throws Exception {
        Pet body = null;
    ResponseEntity<Void> response = api.updatePet(body , accept);

        // TODO: test validations
    }
    
    /**
     * Updates a pet in the store with form data
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePetWithFormTest() throws Exception {
        Long petId = null;
        String name = null;
        String status = null;
    ResponseEntity<Void> response = api.updatePetWithForm(petId, name, status , accept);

        // TODO: test validations
    }
    
    /**
     * uploads an image
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() throws Exception {
        Long petId = null;
        String additionalMetadata = null;
        MultipartFile file = null;
    ResponseEntity<ModelApiResponse> response = api.uploadFile(petId, additionalMetadata, file , accept);

        // TODO: test validations
    }
    
}
