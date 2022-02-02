package pageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;

/************************************************************************
 Description : BasePage class
 Created by : Tomasz Zulawnik

 Class History
 -------------------------------------------------------------------------
 Date 		Author		 							    Reason
 2022-02-02	Tomasz Zulawnik                             Class created
 ************************************************************************/

public class BasePage {

    WebDriver driver;
    public WebDriverWait wait;
    WebDriverWait wait1;
    WebDriverWait wait2;
    WebDriverWait wait5;
    WebDriverWait wait10;
    Actions action;
    JavascriptExecutor jse;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.wait1 = new WebDriverWait(driver, Duration.ofSeconds(1));
        this.wait2 = new WebDriverWait(driver, Duration.ofSeconds(1));
        this.wait5 = new WebDriverWait(driver, Duration.ofSeconds(1));
        this.wait10 = new WebDriverWait(driver, Duration.ofSeconds(1));
        this.action = new Actions(driver);
        this.jse = (JavascriptExecutor) driver;
    }

    protected void takeScreenshot() {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(Paths.get("target") + "\\screenshots\\screenshot_" + java.time.LocalDateTime.now() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
