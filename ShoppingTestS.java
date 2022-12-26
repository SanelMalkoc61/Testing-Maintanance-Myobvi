import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShoppingTestS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myobvi.com");
        Thread.sleep(3000);

        WebElement shopDropdownButton = driver.findElement(By.className("header__icon--search"));
        shopDropdownButton.click();

        WebElement weightLossCategoryLink = driver.findElement(By.className("search__input"));
        weightLossCategoryLink.sendKeys("Detox");
        Thread.sleep(1000);

        WebElement searchItem = driver.findElement(By.className("search__button"));
        searchItem.click();
        Thread.sleep(1000);

        WebElement Register = driver.findElement(By.xpath("//a[@href='/products/detox?variant=39405848363057']"));
        Register.click();
        Thread.sleep(4000);

        WebElement clickShop = driver.findElement(By.className("product-form__submit"));
        clickShop.click();
        Thread.sleep(3000);

        WebElement shoppingCart = driver.findElement(By.id("drawer-checkout-button"));
        shoppingCart.click();
        Thread.sleep(7000);
        WebElement EmailPhone = driver.findElement(By.id("checkout_email"));
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
        WebElement continueButton = driver.findElement(By.id("continue_button"));
        continueButton.click();
        Thread.sleep(5000);
        WebElement continueButton1 = driver.findElement(By.id("continue_button"));
        continueButton1.click();
        Thread.sleep(10000);

    }
}



