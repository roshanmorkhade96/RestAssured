package rest_assured;

import io.restassured.path.json.JsonPath;
import payload.Payload;

public class Complex_Jason {
	public static void main(String[]args) {
		JsonPath js=new JsonPath(Payload.complexpayload());
		//get the count of courses
	     int size=js.getInt("courses.size()");
	     System.out.println(size);
	     //print purches amount
	    int purchesamount= js.getInt("dashboard.purchaseAmount");
	   System.out.println(purchesamount);
	   //getTitle of first test
	   String title=js.getString("courses[0].title");
	  // System.out.println(title);
	  // Print All course titles and their respective Prices

		 for(int i=0;i<size;i++) {
			 //JsonPath js1=new JsonPath(Payload.complexpayload());
			 String Title=js.get("courses["+i+"].title");
			 int price=js.get("courses["+i+"].price");
			 System.out.println(Title+"=="+price);
		 }
	
			 //print number of copies sold by rpa course
			   for(int i=0;i<size;i++) {
				 String Title1=js.get("courses["+i+"].title");
				 if(Title1.equalsIgnoreCase("Cypress")){
					 int copies1=js.get("courses["+i+"].copies");
						System.out.println(copies1); 
				 }
						 
			 }
//			    Verify if Sum of all Course prices matches with Purchase Amount
			   int actualcount =0;
			   for(int i=0;i<size;i++) {
				
					 int price=js.get("courses["+i+"].price");
					 int copies=js.get("courses["+i+"].copies");
					   actualcount=actualcount+(price*copies);
				
				 }
			   int expectcount= js.getInt("dashboard.purchaseAmount");
			   
		 
	}

}
