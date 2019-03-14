package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;// create driver object from WebDriver interface.

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\saadi\\eclipse-workspace\\webAutomationJanuary2019\\Generic\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

    public void typeOnId(String locator, String keyWord) {
        driver.findElement(By.id(locator)).sendKeys(keyWord, Keys.ENTER);
    }

    public void typeOnCSS(String locator, String keyWord) {
        driver.findElement(By.cssSelector(locator)).sendKeys(keyWord, Keys.ENTER);
    }

    public void typeOnWebElement(String locator, String keyWord) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(keyWord, Keys.ENTER);
        } catch (Exception ex) {
            System.out.println(" tried with CSS, did not work. will try by ID nw");
            driver.findElement(By.id(locator)).sendKeys(keyWord, Keys.ENTER);
        }
    }
    public void clickByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }




}




