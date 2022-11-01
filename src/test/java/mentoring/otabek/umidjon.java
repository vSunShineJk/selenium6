package mentoring.otabek;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class umidjon {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com");
    }
    @Test
    public void music() throws Exception{
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("major lazer lean on");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-video-renderer'])[1]")).click();
        String text = driver.findElement(By.xpath("//*[contains(@title, 'Major Lazer & DJ Snake - Lean On (feat. MØ) (Official Music Video)')]")).getText();
        System.out.println(text);
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
