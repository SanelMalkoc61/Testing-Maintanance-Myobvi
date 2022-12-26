import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//vratiti se
public class DetoxTestCard {
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
        EmailPhone.sendKeys("sanel302@gmail.com");
        Thread.sleep(1000);
        WebElement testDropDown = driver.findElement(By.id("checkout_shipping_address_country"));
        Select dropdown = new Select(testDropDown);
        dropdown.selectByIndex(30);
        Thread.sleep(1000);
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
        WebElement contButton = driver.findElement(By.id("continue_button"));
        contButton.click();
        Thread.sleep(6000);
        WebElement continueButton = driver.findElement(By.id("continue_button"));
        continueButton.click();
        Thread.sleep(10000);
        //driver.switchTo().frame(driver.findElement(By.id("number")));
        //driver.findElement(By.id("number")).sendKeys("11");
        //Thread.sleep(2000);
        //WebElement cardName = driver.findElement(By.id("name"));
        //cardName.sendKeys("Sanel Malkoc");
        //Thread.sleep(1000);
        //WebElement cardExpiery = driver.findElement(By.id("expiery"));
        //cardExpiery.sendKeys("0827");
        //Thread.sleep(1000);
        //WebElement codeSecurity = driver.findElement(By.id("verification_value"));
        //codeSecurity.sendKeys("829");
        //Thread.sleep(1000);
        WebElement billingDifferent = driver.findElement(By.id("checkout_different_billing_address_true"));
        billingDifferent.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
