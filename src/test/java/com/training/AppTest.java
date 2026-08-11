package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void getTitle() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://saucedemo.com");
        Thread.sleep(4000);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void testForm() throws InterruptedException, AWTException {
        // WebDriver driver=new ChromeDriver();
        // driver.get("https://www.saucedemo.com/");
        // String title = driver.getTitle();
        // System.out.println("Title :"+title);
        // String pageSource = driver.getPageSource();
        // System.out.println(pageSource);
        // driver.navigate().forward();
        // driver.navigate().back();
        // driver.navigate().refresh();
        // System.out.println(driver.manage().window().getSize());

        // driver.manage().window().maximize();
        // driver.navigate().to("https://amazon.in");
        // Capabilities capabilities = ((ChromeDriver)driver).getCapabilities();
        // String browserName = capabilities.getBrowserName();
        // String browserVersion = capabilities.getBrowserVersion();
        // System.out.println(browserName+" -> "+browserVersion);

        // WebElement element = driver.findElement(By.id("user-name"));
        // element.sendKeys("standard_user");
        // driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // driver.findElement(By.id("login-button")).submit();
        // driver.findElement(By.name("login-button")).submit();
        // driver.findElement(By.className("submit-button")).submit();
        // driver.findElement(By.cssSelector("input[type='submit']")).submit();
        // driver.findElement(By.tagName("input")).sendKeys("standard_user");
        // List<WebElement> elements = driver.findElements(By.tagName("input"));
        // elements.get(0).sendKeys("standard_user");
        // Thread.sleep(3000);
        // elements.get(1).sendKeys("secret_sauce");
        // Thread.sleep(3000);
        // elements.get(2).submit();

        // Robot robot = new Robot();

        // robot.keyPress(KeyEvent.VK_TAB);
        // robot.keyRelease(KeyEvent.VK_TAB);

        // robot.keyPress(KeyEvent.VK_ENTER);
        // robot.keyRelease(KeyEvent.VK_ENTER);

        // Actions actions = new Actions(driver);
        // actions.sendKeys(Keys.ENTER).perform();

        // actions.sendKeys(Keys.TAB)
        // .sendKeys(Keys.ENTER)
        // .perform();
        // Thread.sleep(3000);
        // driver.close();
    }
}
