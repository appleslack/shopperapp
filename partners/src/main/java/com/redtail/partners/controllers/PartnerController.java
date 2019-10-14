package com.redtail.partners.controllers;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * PartnerController
 */
@RestController
@Controller
public class PartnerController {

    private Object getStaticJSON( String path ) {
        // Get the menu that read in @ start of application
        // Resource resource = this.getClass().getResource("/static/MenuItems.json");
        Resource resource = new ClassPathResource(path);

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resource.getInputStream(), Object.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Store A
    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping(
        value="/storeA/product/get/{productId}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Object storeAProductGet(@PathVariable String productId ) {
        System.out.println("Getting for product " + productId );
        return getStaticJSON("/static/StoreAProducts.json");
    }

    
    // Store B - Product Details
    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping(
        value="/storeB/product/details/{productId}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Object storeBProductDetails(@PathVariable String productId ) {
        System.out.println("Getting for product " + productId );
        return getStaticJSON("/static/StoreBDetails.json");
    }

    // Store B - Product Availability
    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping(
        value="/storeB/product/availability/id/{productId}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Object storeBProductAvailability(@PathVariable String productId ) {
        System.out.println("Getting for product " + productId );
        return getStaticJSON("/static/StoreBAvailability.json");
    }

    // Store C - Product Availability
    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping(
        value="/storeC/product/id/{productId}/get",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Object storeCProductDetails(@PathVariable String productId ) {
        System.out.println("Getting for product " + productId );
        return getStaticJSON("/static/StoreCProducts.json");
    }

    
}