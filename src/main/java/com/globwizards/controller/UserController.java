package com.globwizards.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @GetMapping(path = "/users", produces=MediaType.APPLICATION_JSON_VALUE)
  public @ResponseBody String getUsers() {
    
    return "{\"users\":[{\"firstname\":\"Richard\", \"lastname\":\"Feynman\"},"
        + "{\"firstname\":\"Marie\",\"lastname\":\"Curie\"}]}";
  }
}
