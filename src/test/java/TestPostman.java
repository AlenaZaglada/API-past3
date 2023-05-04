package ru.netology.rest;

        import static io.restassured.RestAssured.authentication;
        import static io.restassured.RestAssured.given;
        import static org.hamcrest.Matchers.equalTo;

        import org.junit.jupiter.api.Test;

public class TestPostman {
    @Test
    void shouldReturnData() {
// Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("04.05.2023")
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("04.05.2023"));
    }
}
