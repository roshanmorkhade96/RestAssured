package files;

import io.restassured.path.json.JsonPath;

public class Reusable_Method {

	public static JsonPath RawToJason (String response) {
      JsonPath js1=new JsonPath(response);
		return js1;
	}
	
}
