package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    void shouldSentRequest() {

        given()
                .baseUri("https://postman-echo.com")
                .body("Hello World")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hello World"))
        ;
    }
}
