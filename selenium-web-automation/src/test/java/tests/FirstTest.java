package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void openGoogle() {
        WebDriverManager.chromedriver().setup();   // Auto setup driver
        WebDriver driver = new ChromeDriver();     // Launch browser

        driver.get("https://www.google.com");      // Navigate
        System.out.println("Page title: " + driver.getTitle());

        driver.quit();                             // Close browser
    }
}
