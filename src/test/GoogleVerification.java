package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleVerification {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\KIDS ACADEMY\\Documents\\selenium dependencies\\driver\\ChromeDriver.exe");

    WebDriver driver= new ChromeDriver();
    driver.get("http://www.google.com");
    driver.manage().window().maximize();
    Thread.sleep(1000);
    String googleTitle= driver.getTitle();
    if(googleTitle.equals("Google")){
        System.out.println("Google title verification passed");
    }else {
        System.out.println("Google title failed" );
    }
 driver.get("hhtp://cybertekschool.com");
    String cbUrl=driver.getCurrentUrl();
    if (cbUrl.contains("Cybertekschool")){
        System.out.println("Cybertekschool url Passsed");
    }else {
        System.out.println("Cybertekschool url failed");
    }

    }
}
