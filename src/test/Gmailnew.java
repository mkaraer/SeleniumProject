import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailnew {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\KIDS ACADEMY\\Documents\\selenium dependencies\\driver\\ChromeDriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Gmail")).click();
        String gmailTitle = driver.getTitle();
        if (gmailTitle.contains("Gmail")) {
            System.out.println("Gmail verification passed");
        } else {
            System.out.println("gamil verification faileld");

        }
    }
}
