import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myobvi.com/account/login");
        Actions actions = new Actions(driver);

        WebElement emailField = driver.findElement(By.id("CustomerEmail"));
        emailField.sendKeys("t@gm");
        WebElement passwordField = driver.findElement(By.id("CustomerPassword"));
        passwordField.sendKeys("gdb");
        Thread.sleep(2000);

        WebElement Continue1 = driver.findElement(By.xpath("//*[text()='SIGN IN']"));
        Continue1.click();
        Thread.sleep(2000);


    driver.quit();
    }

}