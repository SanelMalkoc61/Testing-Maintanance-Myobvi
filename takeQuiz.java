import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeQuiz {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myobvi.com/pages/quiz-main");
        Thread.sleep(3000);

        WebElement buttonGetStarted = driver.findElement(By.className("oct-quiz-btn--primary"));
        buttonGetStarted.click();
        Thread.sleep(2000);

        WebElement q1 = driver.findElement(By.xpath("//*[text()='I Want to Lose Weight']"));
        q1.click();
        Thread.sleep(2000);

        WebElement q2 = driver.findElement(By.xpath("//*[text()='Travel']"));
        q2.click();
        Thread.sleep(2000);

        WebElement Continue1 = driver.findElement(By.xpath("//*[text()='CONTINUE']"));
        Continue1.click();
        Thread.sleep(2000);

        WebElement q3 = driver.findElement(By.xpath("//*[text()='Keto']"));
        q3.click();
        Thread.sleep(2000);

        WebElement q4 = driver.findElement(By.xpath("//*[text()='I Am Somewhat Active']"));
        q4.click();
        Thread.sleep(2000);

        WebElement q5 = driver.findElement(By.xpath("//*[text()='I Rarely Make Healthy Choices']"));
        q5.click();
        Thread.sleep(2000);

        WebElement q6 = driver.findElement(By.xpath("//*[text()='Less Than Half a Gallon']"));
        q6.click();
        Thread.sleep(2000);

        WebElement q7 = driver.findElement(By.xpath("//*[text()='I drink coffee occasionally']"));
        q7.click();
        Thread.sleep(2000);

        WebElement q8 = driver.findElement(By.xpath("//*[text()='Water']"));
        q8.click();
        Thread.sleep(2000);

        WebElement Continue2 = driver.findElement(By.xpath("//*[text()='CONTINUE']"));
        Continue2.click();
        Thread.sleep(2000);

        WebElement enter1 = driver.findElement(By.xpath("//input[@type='text']"));
        enter1.sendKeys("SAnel Malkoc");
        Thread.sleep(2000);

        WebElement SubmitName = driver.findElement(By.xpath("//*[text()='SUBMIT']"));
        SubmitName.click();
        Thread.sleep(2000);

        WebElement q9 = driver.findElement(By.xpath("//*[text()='18-25']"));
        q9.click();
        Thread.sleep(2000);

        WebElement emailEnter = driver.findElement(By.xpath("//input[@type='text']"));
        emailEnter.sendKeys("t@gm");
        Thread.sleep(2000);

        WebElement SubmitEmail = driver.findElement(By.xpath("//*[text()='SUBMIT']"));
        SubmitEmail.click();
        Thread.sleep(2000);

        driver.quit();



    }
}



