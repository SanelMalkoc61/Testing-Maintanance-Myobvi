import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myobvi.com");

        WebElement ButtonAccount = driver.findElement(By.className("account__header-text"));
        ButtonAccount.click();
        Thread.sleep(5000);

        WebElement Register = driver.findElement(By.xpath("//a[@href='/account/register']"));
        Register.click();

        WebElement firstNameField = driver.findElement(By.id("RegisterForm-FirstName"));
        firstNameField.sendKeys("Sanel");
        Thread.sleep(1000);

        WebElement lastNameField = driver.findElement(By.id("RegisterForm-LastName"));
        lastNameField.sendKeys("Malkoc");
        Thread.sleep(1000);

        WebElement emailField = driver.findElement(By.id("RegisterForm-email"));
            emailField.sendKeys("sanel.malkoc302se@gmail.com");

        WebElement passwordField = driver.findElement(By.id("RegisterForm-password"));
        passwordField.sendKeys("12345678");

        driver.quit();
    }
}
