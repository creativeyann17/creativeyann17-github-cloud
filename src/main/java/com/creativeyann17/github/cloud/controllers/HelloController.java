package com.creativeyann17.github.cloud.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
class HelloController {
  @Get("/")
  String index() {
    return "Hello Micronaut!";
  }
}