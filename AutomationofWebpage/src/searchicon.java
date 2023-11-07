import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class searchicon {

	public void searchAndAddTocart(WebDriver driver)  { 
			// TODO Auto-generated method stub
			driver.get("http://www.google.com");  
	        driver.manage().window().maximize();
			String url = "https://www.snapdeal.com/search?clickSrc=top_searches&keyword=tshirt&categoryId=0&vertical=p&noOfResults=20&SRPID=topsearch&sort=rlvncy";
	        driver.get(url);   
	        WebElement inputField=  driver.findElement(By.xpath("//input[@id='inputValEnter']"));  
	        inputField.clear();
	        inputField.sendKeys("hairclips");
	        driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
	        driver.findElement(By.xpath("//img[@title='Vogue Hair Accessories Hair Clip Beautiful Fancy Side Clip Hair Juda Pin Partywear For Women And Girls Hair Accessory Set']")).click(); 


	

}
} 
