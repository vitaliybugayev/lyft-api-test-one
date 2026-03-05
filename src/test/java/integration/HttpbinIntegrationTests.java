package integration;

import com.lyft.model.request.post.SongsItemRequest;
import com.lyft.model.response.Ip;
import com.lyft.model.response.post.PostResponse;
import com.lyft.steps.HttpbinSteps;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HttpbinIntegrationTests extends BaseTest {

    @Test
    public void getIpTest() {
        var ipResponse = HttpbinSteps.getIp().statusCode(200).extract().as(Ip.class);
        System.out.println("task 1: " + ipResponse);
    }

    @Test
    public void postPayloadTest() {
        var id = "test-access-1";
        var recordName = "eminem";
        var location = "package.yaml";
        var songItem1 = new SongsItemRequest(29900, "country", "disco", "english");
        var songItem2 = new SongsItemRequest(43234, "rock", "theatre", "french");
        List<SongsItemRequest> songsItems = new ArrayList<>();
        songsItems.add(songItem1);
        songsItems.add(songItem2);
        var country = "US";
        List<String> regions = new ArrayList<>();
        regions.add("portland");
        regions.add("sfo");
        regions.add("atlanta");

        var postResponse = HttpbinSteps.postPayload(country, regions, songsItems, recordName, location, id)
                .statusCode(200).extract().as(PostResponse.class);

        System.out.println("Post response: " + postResponse);
    }
}
