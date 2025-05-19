package techolutiontest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runajakkam {

	 WebDriver driver;
	 @BeforeMethod

	 public void sampleRun(){

	      driver= new ChromeDriver();
	     driver.get("https://www.jotform.com/form-templates/teaching-session-feedback");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

	     driver.manage().window().maximize();
	 }
	 @Test

	 public void starTest(){
	 int total=5;

	 List<WebElement> stars=driver.findElements(By.xpath("//div[@id='cid_29']//div[@class='rating-item']"));

	 int select=2;

	     for(WebElement star:stars){

	       if(select<total){

	         System.out.println(stars.size());
	         star.click();
	       }
	       select++;





	     }



	 }



	 }

	
