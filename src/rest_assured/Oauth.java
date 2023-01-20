package rest_assured;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pojo.Get_course;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Oauth {
	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		String[] courseTitles= { "Selenium Webdriver Java","Cypress","Protractor"};
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\baps\\eclipse-workspace\\Rest_Assured_Demo\\drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=verifyfjdss");
//		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("fdfd");
//		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("fxfe");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.ENTER);
//		Thread.sleep(4000);
		String url="https://rahulshettyacademy.com/getCourse.php?state=verifyfjdss&code=4%2F0AWgavdf6CWypgEk7HarllRYuHxsODIYz6g1xAFL7fOiJqkIvxKoQHopW_nSAci5jRZBc4Q&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent";
		String partialcode=url.split("code=")[1];
		String code=partialcode.split("&scope")[0];
		System.out.println(code);


		//   tagname[attribute='value']

		String accessTokenResponse=	given().urlEncodingEnabled(false)
				.queryParams("code",code)
				.queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
				.queryParams("grant_type","authorization_code")
				.when().log().all()
				.post("https://www.googleapis.com/oauth2/v4/token").asString();
		JsonPath js=new JsonPath(accessTokenResponse);
		String accessToken=js.getString("access_token");





		Get_course gc=given().queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON)
				.when()
				.get("https://rahulshettyacademy.com/getCourse.php").as(Get_course.class);
		System.out.println(gc.getUrl());
		System.out.println(gc.getExperties());
		System.out.println(gc.getInstructor());
		System.out.println(gc.getServices());
		System.out.println(gc.getCourses());
	}
}
