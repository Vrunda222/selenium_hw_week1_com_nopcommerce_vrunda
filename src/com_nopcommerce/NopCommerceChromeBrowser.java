package com_nopcommerce;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * https://demo.nopcommerce.com/login?returnUrl=%2F
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */
public class NopCommerceChromeBrowser {
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    public static void main(String[] args) {
        //Setup chrome browser.
        WebDriver driver = new ChromeDriver();
        //Open URL.
        driver.get(baseUrl);
        // Maximise the browser window
        driver.manage().window().maximize();
        // We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Print the title of the page.
        String getTitle = driver.getTitle();
        System.out.println("Page Title: " +getTitle);
        //Print the current url.
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Page Current URL: " +currentUrl);
        //Print the page source.
        String pageSource = driver.getPageSource();
        System.out.println("Page Page Source: " +pageSource);
        //Navigate to Url.
        String navigateToUrl = "https://demo.nopcommerce.com/login?returnUrl= %2F";
        driver.navigate().to(navigateToUrl);
        //Print the current url.
        String printCurrentUrl = driver.getCurrentUrl();
        System.out.println("Page Current URL: " +printCurrentUrl);
        //Navigate back to the home page.
        driver.navigate().back();
        //Navigate to the login page.
        driver.navigate().forward();
        //Print the current url.
        String prtCurrentUrl = driver.getCurrentUrl();
        System.out.println("Page Current URL: " +prtCurrentUrl);
        //Refresh the page.
        driver.navigate().refresh();
        //Enter the email to email field.
        WebElement emailID = driver.findElement(By.id("Email"));
        emailID.sendKeys("Prime123@gmail.com");
        //Enter the password to password field.
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("12345");
        //Click on Login Button.
        WebElement loginButton = driver.findElement(By.className("login-button"));
        loginButton.click();
        //Close the browser.
        driver.quit();
    }
}
