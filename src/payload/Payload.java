package payload;

public class Payload {

	public static String AdddPlace() {
		return "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "";



	}
	String updatedplace="70 Summer walk, USA\\\\\\";
	public static String UpdatePlace() {
		return "{\\r\\n\"\r\n"
				+ "		         			+ \"\\\"place_id\\\":\\\"\"+placeid+\"\\\",\\r\\n\"\r\n"
				+ "		         			+ \"\\\"address\\\":\\\"70 Summer walk, USA\\\",\\r\\n\"\r\n"
				+ "		         			+ \"\\\"key\\\":\\\"qaclick123\\\"\\r\\n\"\r\n"
				+ "		         			+ \"}\\r\\n\"\r\n"
				+ "		         			+ \"";



	}

	public static String complexpayload() {
		return "{\r\n"
				+ "\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"courses\": [\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\r\n"
				+ "\"price\": 50,\r\n"
				+ "\r\n"
				+ "\"copies\": 6\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "\"price\": 40,\r\n"
				+ "\r\n"
				+ "\"copies\": 4\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\r\n"
				+ "\"price\": 45,\r\n"
				+ "\r\n"
				+ "\"copies\": 10\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "1. Print No of courses returned by API\r\n"
				+ "\r\n"
				+ "2.Print Purchase Amount\r\n"
				+ "\r\n"
				+ "3. Print Title of the first course\r\n"
				+ "\r\n"
				+ "4. Print All course titles and their respective Prices\r\n"
				+ "\r\n"
				+ "5. Print no of copies sold by RPA Course\r\n"
				+ "\r\n"
				+ "6. Verify if Sum of all Course prices matches with Purchase Amount";

	}
	public static String dynamicpayload (String aisle, String isbn) {
		return "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
	}
	
}
