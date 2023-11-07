import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		 searchicon searchIcon = new searchicon();

	        // Call the searchAndAddToCart method to perform the search and add to cart action
	        searchIcon.searchAndAddTocart(driver);

        Set<String> windowhandles = driver.getWindowHandles(); 
        System.out.println(windowhandles);
        
        Iterator<String> iterator = windowhandles.iterator(); 
        String parentwindow = iterator.next(); 
        String childwindow = iterator.next(); 
        driver.switchTo().window(childwindow);
        WebElement pincode =  driver.findElement(By.xpath("//input[@id='pincode-check']"));  
        pincode.clear(); 
        pincode.sendKeys("5600100"); 
        driver.findElement(By.xpath("//span[normalize-space()='check']"));
        driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click(); 
    
	}
	

}
