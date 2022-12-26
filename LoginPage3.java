import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myobvi.com/account/login");
        Actions actions = new Actions(driver);

        WebElement passwordField = driver.findElement(By.id("CustomerPassword"));
        passwordField.sendKeys("gdb");
        WebElement buttonf = driver.findElement(By.name(("Sign in")));
        actions.doubleClick(buttonf).perform();

    driver.quit();
    }

}