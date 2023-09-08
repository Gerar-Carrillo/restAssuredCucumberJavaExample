package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.Employee;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class restAssuredExampleSteps {
    Employee employee;
    private RequestSpecification request;
    private Response response;

    @Given("I have data {string}, {string} and {string}")
    public void iHaveDataAnd(String name, String salary, String age) {
    employee = new Employee(name,salary,Integer.parseInt(age));
    }

    @And("I use employee header")
    public void iUseEmployeeHeader() {
        request = given().header("Content-Type", "application/json");
    }

    @When("I consume the api")
    public void iConsumeTheApi() {
        response = request.given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://dummy.restapiexample.com/api/v1/employees")
                .then()
                .extract().response();
    }

    @When("I create post request to create an employee")
    public void iCreatePostRequestToCreateAnEmployee() {
        response = request.when()
                .body(employee)
                .post("https://dummy.restapiexample.com/api/v1/create")
                .then()
                .extract().response();
    }



    @Then("I get status code {string} from db")
    public void iGetStatusCodeFromDb(String statusCode) {
        assertEquals(Integer.parseInt(statusCode), response.getStatusCode());
    }
}
