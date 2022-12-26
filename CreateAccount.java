import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
    public static void main(String[] args) throws InterruptedException {
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
        Thread.sleep(4000);

        //Create button ne radi ispod
        WebElement Create1 = driver.findElement(By.xpath("//button[contains[text(),'Create']]"));
        Create1.click();

    driver.quit();
    }
}
