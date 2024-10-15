package ru.netology.rest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTestV1 {
    @Test
    void shouldReturnPostTest() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some data")

        .when()
                .post("/post")

        .then()
                .statusCode(200)
                .body("data", equalTo("wrong data"))
        ;
    }
}