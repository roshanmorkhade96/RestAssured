package rest_assured;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.Reusable_Method;

import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payload.Payload;

import static io.restassured.RestAssured.*;

public class Dynamic_json {
	@Test(dataProvider="BooksData")
	public void dynamicjason(String isbn,String aisle){

		RestAssured.baseURI="http://216.10.245.166";
		String respose=given().log().all().header("Content-Type","application/json").
				body(Payload.dynamicpayload(isbn,aisle)).
				when().
				post("Library/Addbook.php")
				.then().statusCode(200).extract().response().asString();
		JsonPath js=Reusable_Method.RawToJason(respose);
		String id=js.get("ID");
		System.out.println(id);
	}

	@DataProvider(name="BooksData")
	public Object[][] getData() {
		return new Object[][]	{{"jsjd","672582"},{"mnbjdk","567267"},{"sdjhdh","72772"}};	



	}

}
