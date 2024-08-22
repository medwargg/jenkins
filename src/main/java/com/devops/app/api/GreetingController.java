package com.devops.app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

  @GetMapping("/greetings")
  public Mono<String> hello() {
    return Mono.just("Hello World!");
  }

}
