package Andreea.testAutomationInternship;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestForShoppingMall {
    private static org.openqa.selenium.support.ui.WebDriverWait WebDriverWait;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Now the driver is initialized and ready to be used
        driver.get("https://pl-galeria-warminska-uat.azurewebsites.net/en/csr#EDUCATION");
        driver.manage().window().maximize();
        WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement firstName = driver.findElement(By.xpath("html/body/div[1]/div/footer/div[1]/div/div[1]/div[2]/div[2]/button[2]"));
         ;
//        firstName.sendKeys("Ann");
//        //WebElement inputElement = driver.findElement(cssSelector)));






        // Remember to quit the driver
       // driver.quit();

        }
    }

