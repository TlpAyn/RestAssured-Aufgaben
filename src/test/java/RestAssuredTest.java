import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class RestAssuredTest {

    @Test
    public void singleUserBddTest(){

        when().get("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .body("data.email",equalTo("janet.weaver@reqres.in"))
                .time(lessThan(1000L));

    }
    @Test
    public void singleUserTest(){
        RestAssured.baseURI = "";
    }

}
