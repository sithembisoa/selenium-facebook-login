package selenium.twitter;

/**
 * Hello world!
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class App {
     public static void main(String[] args) throws InterruptedException{
          System.setProperty("webdriver.chrome.driver","C:\\tmp\\chromedriver\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.facebook.com");
          driver.findElement(By.id("email")).sendKeys("");
          driver.findElement(By.id("pass")).sendKeys("");
          Thread.sleep(5000);
          driver.findElement(By.id("u_0_b")).click(); 
          Thread.sleep(7000);
     }
}