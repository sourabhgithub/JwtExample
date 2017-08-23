package com.globwizards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class GlobwizardsApplication {

  @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  String hello() {
    return "hello world";
  }

  public static void main(String[] args) {
    SpringApplication.run(GlobwizardsApplication.class, args);
  }
}
