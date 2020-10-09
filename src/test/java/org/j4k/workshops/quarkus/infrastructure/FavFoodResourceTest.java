package org.j4k.workshops.quarkus.infrastructure;

import java.util.UUID;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

@QuarkusTest
public class FavFoodResourceTest {

    @Test
    public void testFavFoodEndpoint() {

    final String json = "{\"customerName\":\"Lemmy\",\"orderId\":\"cdc07f8d-698e-43d9-8cd7-095dccace575\",\"lineItems\":[{\"item\":\"COFFEE_BLACK\",\"itemId\":\"0eb0f0e6-d071-464e-8624-23195c8f9e37\",\"quantity\":1}]}";

        given()
          .accept(MediaType.APPLICATION_JSON)
          .contentType(MediaType.APPLICATION_JSON)
          .body(json)
          .when()
          .post("/FavFood")
          .then()
             .statusCode(202)
             .body("orderId", equalTo("cdc07f8d-698e-43d9-8cd7-095dccace575"))
             .body("customerName", equalTo("Lemmy"));
    }

}