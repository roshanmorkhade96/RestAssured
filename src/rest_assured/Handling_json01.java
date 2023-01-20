package rest_assured;

import io.restassured.path.json.JsonPath;
import payload.Payload;

public class Handling_json01 {
	public static void main(String[]args) {
		JsonPath js=new JsonPath(Payload.complexpayload());
		//1. Print No of courses returned by API
		int Size=js.getInt("courses.size()");
		System.out.println(Size);
		//2.Print Purchase Amount
		int purchesAmt=js.getInt("dashboard.purchaseAmount");
		System.out.println(purchesAmt);
		String website=js.getString("dashboard.website");
		System.out.println(website);
		int courses=js.getInt("courses[0].price");
		System.out.println(courses);
		String Title=js.getString("courses[0].title");
		//System.out.println(Title);
		//getcoursetitle with pices
		
		for (int i=0;i<=Size-1;i++) {
			int price=js.getInt("courses["+i+"].price");
			String title=js.getString("courses["+i+"].title");
			System.out.println(title+"=="+price);
		}
		int total=0;
		for (int i=0;i<=Size-1;i++) {
			int price=js.getInt("courses["+i+"].price");
			total=total+price;
			}
		System.out.println(total);
	}

}