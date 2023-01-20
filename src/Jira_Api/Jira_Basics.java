package Jira_Api;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
public class Jira_Basics {
	public static void main (String[]args) {
		RestAssured.baseURI=" http://localhost:8080";
		given().pathParam(DEFAULT_BODY_ROOT_PATH, args);
	} 

}
