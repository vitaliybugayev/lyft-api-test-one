package integration;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite(alwaysRun = true)
    public static void init() {

        RestAssured.filters(new AllureRestAssured());


        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                // Enable logging for failed requests
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
                .build();
    }
}
