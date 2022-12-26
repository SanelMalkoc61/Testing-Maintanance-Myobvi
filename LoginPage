import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myobvi.com/account/login");
        Actions actions = new Actions(driver);

        WebElement emailField = driver.findElement(By.id("CustomerEmail"));
        emailField.sendKeys("t@gm");
        WebElement passwordField = driver.findElement(By.id("CustomerPassword"));
        passwordField.sendKeys("gdb");
        WebElement buttonf = driver.findElement(By.name(("Sign in"))); //sign in dugme
        actions.doubleClick(buttonf).perform();

    driver.quit();
    }

}