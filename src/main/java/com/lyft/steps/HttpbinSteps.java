package com.lyft.steps;

import com.lyft.model.request.post.PostPayload;
import com.lyft.model.request.post.SongsItemRequest;
import com.lyft.utils.Endpoints;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.restassured.response.ValidatableResponse;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class HttpbinSteps {

    @Step
    @Description("Get ip data")
    public static ValidatableResponse getIp() {
        return
                given()
                        .baseUri(Endpoints.IP_URI)
                        .when()
                        .get()
                        .then();
    }

    @Step
    @Description("Post payload")
    public static ValidatableResponse postPayload(String country, List<String> regions, List<SongsItemRequest> songsItemRequests,
                                                  String recordName, String location, String id) {
        return given()
                .baseUri(Endpoints.POST_URI)
                .body(new PostPayload(country, new ArrayList<String>(regions),
                        new ArrayList<SongsItemRequest>(songsItemRequests), recordName, location, id))
                .when()
                .post()
                .then();
    }


}
