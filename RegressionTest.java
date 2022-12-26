import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class RegressionTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myobvi.com/account/register");

        WebElement firstNameField = driver.findElement(By.id("RegisterForm-FirstName"));
        firstNameField.sendKeys("S");
        WebElement lastNameField = driver.findElement(By.id("RegisterForm-LastName"));
        lastNameField.sendKeys("L");
        WebElement emailField = driver.findElement(By.id("RegisterForm-email"));
        emailField.sendKeys("t@gm");
        WebElement passwordField = driver.findElement(By.id("RegisterForm-password"));
        passwordField.sendKeys("gdb");
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        assertTrue(errorMessage.isDisplayed());

    driver.quit();
    }
}



