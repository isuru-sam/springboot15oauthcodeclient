package com.authcode.client;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
class UserController {

    @Autowired
    private OAuth2RestOperations restTemplate;

    @Value("${config.oauth2.resourceURI}")
    private String resourceURI;

    
    @RequestMapping("/name")
    public String home1() {
        return "is"+restTemplate.getAccessToken();
    }
    
    @RequestMapping("/home")
    public JsonNode home() {
        return restTemplate.getForObject(resourceURI, JsonNode.class);
    }

}