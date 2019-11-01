package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\KIDS ACADEMY\\Documents\\selenium dependencies\\driver\\ChromeDriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Gmail")).click();
        // driver.findElement(By name("q")).sendKeys(...keysToSend:"spoon");
        String gmailTitle = driver.getTitle();
        if (gmailTitle.contains("Gmail")) {
            System.out.println("Gmail title verification passed");
        } else {
            System.out.println("Gmail title verification failed");
        }
        driver.navigate().back();
        String googleTitle = driver.getTitle();
        if (googleTitle.contains("Google")) {
            System.out.println("Google title verification passed");
        } else {
            System.out.println("Google title verification passed");
        }
        driver.navigate().forward();


    }
}