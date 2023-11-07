import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class otherfilters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.google.com");  
        driver.manage().window().maximize();
		String url = "https://www.snapdeal.com/search?clickSrc=top_searches&keyword=tshirt&categoryId=0&vertical=p&noOfResults=20&SRPID=topsearch&sort=rlvncy";
        driver.get(url);  
        
        //driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[4]/div/div[1]/div[2]/div[4]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();  
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement button = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[4]/div/div[1]/div[2]/div[6]/div[1]"));
        new Actions(driver).moveToElement(button).click().perform(); 
     
        
        //WebElement scroll1= driver.findElement(By.xpath("//label[@for='Color_s-White']"));  
        //Actions actions1 = new Actions(driver);
        //actions1.moveToElement(scroll1).perform();
        //driver.findElement(By.xpath("//div[@data-filtername='Brand']//div[@class='filter-name-section filter-type clearfix']")).click();
        WebElement button1 = driver.findElement(By.xpath("//button[@class='view-more-button btn btn-line btn-theme-secondary js-view-more']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", button1);

        
   
       driver.findElement(By.xpath("//*[@id=\"tab-\"]/div/div/div[2]/input")).click();
        WebElement inputField =  driver.findElement(By.xpath("//*[@id=\"tab-\"]/div/div/div[2]/input"));  
        inputField.sendKeys("bewakoof");
        //driver.findElement(By.xpath("//div[@class='btn applyFilters lfloat']")).click();
        
	}

}
