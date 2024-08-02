package org.jjad.quarkus.starting;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;

public class HelloSteps {

    private static Response response;

    @Given("Recurso libro")
    public void book_resource() {
        //TODO: It could be login before execute books api
    }

    @When("Solicitar libros por la API")
    public void getBooks(){
        RestAssured.port = 8083;
        RequestSpecification request = RestAssured.given();
        response = request.get("/api/books/jjad");
    }

    @Then("Deberia recibir \"Hello RESTEasy\"")
    public void I_should_be_told_Hello_RESTEasy(){
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals("Hello RESTEasy", response.asString());
    }

}
