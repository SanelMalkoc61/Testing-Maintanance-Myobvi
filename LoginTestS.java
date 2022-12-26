import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myobvi.com");

        WebElement ButtonAccount = driver.findElement(By.className("account__header-text"));
        ButtonAccount.click();
        Thread.sleep(5000);

        WebElement emailField = driver.findElement(By.id("CustomerEmail"));
        emailField.sendKeys("sanel302@gmail.com");
        Thread.sleep(1000);

        WebElement passwordField = driver.findElement(By.id("CustomerPassword"));
        passwordField.sendKeys("12345678");
        Thread.sleep(1000);

        //WebElement signInButton = driver.findElement(By.cssSelector("button[data-test='sign-in']"));
        //signInButton.click();

        driver.quit();
    }
}

