import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopMenuS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myobvi.com");
        Thread.sleep(3000);

        WebElement Register = driver.findElement(By.xpath("//a[@href='/pages/store-locator']"));
        Register.click();
        Thread.sleep(7000);

        WebElement Searchh = driver.findElement(By.className("stockist-search-field"));
        Searchh.sendKeys("Washington");
        Thread.sleep(1000);

        WebElement SearchButton = driver.findElement(By.className("stockist-feature-bg-color"));
        SearchButton.click();
        Thread.sleep(5000);

        WebElement ClickLink = driver.findElement(By.xpath("//a[@href='https://www.vitaminshoppe.com/']"));
        ClickLink.click();


    }
}