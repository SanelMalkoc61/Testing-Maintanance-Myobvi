import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newsletterClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myobvi.com/");

        WebElement newsletterField = driver.findElement(By.id("email_40926449"));
        newsletterField.sendKeys("t@gm");
        Thread.sleep(3000);
        WebElement newsletterClick = driver.findElement(By.className("needsclick"));
        newsletterClick.click();
        Thread.sleep(4000);
        driver.quit();
    }
}

