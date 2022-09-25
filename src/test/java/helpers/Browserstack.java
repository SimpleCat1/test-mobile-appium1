package helpers;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;

public class Browserstack {
    public static CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);

    public static String videoUrl(String sessionId) {
        return given()
                .auth().basic(credentials.login(), credentials.password())
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId + ".json")
                .then()
                .statusCode(200)
                .log().body()
                .extract()
                .response()
                .path("automation_session.video_url");
//нужен для получения данных из browsert , что он там сделал и потом прикладывать это видео к allur Отчету
    }
}
