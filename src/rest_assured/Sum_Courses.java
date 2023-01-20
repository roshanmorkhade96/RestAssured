package rest_assured;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import payload.Payload;

public class Sum_Courses {
	@Test
	public void sum() {
		 // Verify if Sum of all Course prices matches with Purchase Amount
		JsonPath js=new JsonPath(Payload.complexpayload());
		//get the count of courses
	     int size=js.getInt("courses.size()");
	     System.out.println(size);
		   int actualcount =0;
		   for(int i=0;i<size;i++) {
			
				 int price=js.get("courses["+i+"].price");
				 int copies=js.get("courses["+i+"].copies");
				   actualcount=actualcount+(price*copies);
			
			 }
		   int expectcount= js.getInt("dashboard.purchaseAmount");
		   
	}

}
