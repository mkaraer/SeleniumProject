package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\KIDS ACADEMY\\Documents\\selenium dependencies\\driver\\ChromeDriver.exe");
      WebDriver driver=new ChromeDriver();

      driver.get("http://amazon.com");
      driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("BeyBlade Burst");
      driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
      driver.manage().window().maximize();
        Thread.sleep(1000);
      driver.navigate().back();
      Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//
        String title=driver.getTitle();
        System.out.println("title"+ title);
        String url=driver.getCurrentUrl();
        System.out.println(url);
    //    driver.close();








    }
}

