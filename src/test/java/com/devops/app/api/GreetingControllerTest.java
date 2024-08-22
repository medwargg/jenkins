package com.devops.app.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest(GreetingController.class)
class GreetingControllerTest {

  private WebTestClient webTestClient;

  @BeforeEach
  void setUp() {
    webTestClient = WebTestClient.bindToController(new GreetingController()).build();
  }

  @Test
  @DisplayName("Test the greeting returned by the controller")
  void hello() {
    webTestClient
        .get()
        .uri("/greetings")
        .exchange()
        .expectStatus().isOk()
        .expectBody(String.class).isEqualTo("Hello World!");
  }

}