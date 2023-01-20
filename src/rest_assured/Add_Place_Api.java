package rest_assured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payload.Payload;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.Reusable_Method;

public class Add_Place_Api {
	@Test
	//create resource using post
	public void post()
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
				.body(Payload.AdddPlace()).
				when().post("/maps/api/place/add/json").then().log().all().statusCode(200)
				.header("Server","Apache/2.4.41 (Ubuntu)").body("scope", equalTo("APP")).extract().response().asString();
		System.out.println(response);
		JsonPath js=new JsonPath(response);
		String Place_id=js.get("place_id");
		System.out.println(Place_id);

		//update using put
		System.out.println("this is put request");
		String Newadd= "Summer walk, Africa";
		given().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+Place_id+"\",\r\n"
				+ "\"address\":\""+Newadd+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when().put("/maps/api/place/update/json").then().statusCode(200)
		.body("msg",equalTo("Address successfully updated"));

		//RETRIVE USING GET
		System.out.println("this is get request");
		String res=given().queryParam("key", "qaclick123").queryParam("place_id", Place_id).
				when().get("/maps/api/place/get/json")
				.then().statusCode(200).extract().response().asString();
		JsonPath js1=Reusable_Method.RawToJason(res);

		String actualadd=js1.get("address");
		System.out.println(actualadd);
		Assert.assertEquals(actualadd, Newadd); 

	}
}
