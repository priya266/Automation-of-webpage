import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class PageAutomationTest {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub 
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\dharsika\\Downloads\\chromedriver-win32\\chromedriver.exe"); 
	
		WebDriver driver = new ChromeDriver(); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("http://www.google.com");  
        driver.manage().window().maximize();
		String url = "https://www.snapdeal.com/search?clickSrc=top_searches&keyword=tshirt&categoryId=0&vertical=p&noOfResults=20&SRPID=topsearch&sort=rlvncy";
        driver.get(url);  
       
    WebElement toogle=  driver.findElement(By.xpath("//*[@class='sd-icon sd-icon-expand-arrow sort-arrow']")); 
     toogle.click();
     int[] desiredIndices = {0, 1, 2, 3, 4, 5}; // Select elements with data-index 0, 1, and 2

     for (int desiredIndex : desiredIndices) {
         // Construct the CSS selector for the specific data-index value
         String cssSelector = "ul.sort-value li[data-index='" + desiredIndex + "']";

         // Wait for the element to be clicked
         WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelector)));

         // Click the element
         dropdownElement.click();  
         toogle.click(); 
     }
          
       driver.quit(); 

	}
         
}