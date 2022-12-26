import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class DetoxTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myobvi.com/collections/health-goal-weight-loss");

        WebElement productLink = driver.findElement(By.className("single-item-button-4815191310385"));
        productLink.click();
        Thread.sleep(5000);

        WebElement checkoutButton = driver.findElement(By.id("drawer-checkout-button"));
        checkoutButton.click();
        Thread.sleep(5000);
        WebElement EmailPhone = driver.findElement(By.id("checkout_email_or_phone"));
        EmailPhone.sendKeys("sa");
        Thread.sleep(1000);
        //WebElement zipCodeField = driver.findElement(By.id("checkout_shipping_adress_country"));
        //zipCodeField.sendKeys("WC2J J9Q");
        WebElement firstName = driver.findElement(By.id("checkout_shipping_address_first_name"));
        firstName.sendKeys("Sanel");
        Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.id("checkout_shipping_address_last_name"));
        lastName.sendKeys("Malkoc");
        Thread.sleep(1000);
        WebElement addressName = driver.findElement(By.id("checkout_shipping_address_address1"));
        addressName.sendKeys("Titova 1");
        Thread.sleep(1000);
        WebElement postalCode = driver.findElement(By.id("checkout_shipping_address_zip"));
        postalCode.sendKeys("71000");
        Thread.sleep(1000);
        WebElement cityName = driver.findElement(By.id("checkout_shipping_address_city"));
        cityName.sendKeys("Sarajevo");
        Thread.sleep(1000);
        WebElement continueButton = driver.findElement(By.id("continue_button"));
        continueButton.click();
        Thread.sleep(1000);

        WebElement errorMessage = driver.findElement(By.id("error-message"));
        assertTrue(errorMessage.isDisplayed());

        driver.quit();
    }
}
