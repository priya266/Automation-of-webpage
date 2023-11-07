import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PriceRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.google.com");  
        driver.manage().window().maximize();
		String url = "https://www.snapdeal.com/search?clickSrc=top_searches&keyword=tshirt&categoryId=0&vertical=p&noOfResults=20&SRPID=topsearch&sort=rlvncy";
        driver.get(url);   
       
     // Locate the left and right slider elements using XPaths
        WebElement leftSlider = driver.findElement(By.xpath("//a[contains(@class, 'price-slider-scroll left-handle')]"));
        WebElement rightSlider = driver.findElement(By.xpath("//a[contains(@class, 'price-slider-scroll right-handle')]"));

        // Initialize the Actions class
        Actions actions = new Actions(driver);

        // Define the pixel offset for slider movement
        int sliderMoveOffset = 3; // Adjust the value as needed

        // Move the left slider forward (increase value)
        actions.clickAndHold(leftSlider).moveByOffset(sliderMoveOffset, 0).release().perform();

        // Move the left slider backward (decrease value)
        actions.clickAndHold(leftSlider).moveByOffset(-sliderMoveOffset, 0).release().perform();

        // Move the right slider forward (increase value)
        actions.clickAndHold(rightSlider).moveByOffset(sliderMoveOffset, 0).release().perform();

        // Move the right slider backward (decrease value)
        actions.clickAndHold(rightSlider).moveByOffset(-sliderMoveOffset, 0).release().perform(); 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement starRating= driver.findElement(By.xpath("//*[@id=\"avgRating-4.0\"]")); 
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", starRating);
        starRating = wait.until(ExpectedConditions.elementToBeClickable(starRating));
       starRating.click(); 
       System.out.println(starRating.isSelected());
       
      } }