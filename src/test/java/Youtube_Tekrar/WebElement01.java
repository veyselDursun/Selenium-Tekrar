package Youtube_Tekrar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement01 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.amazon.com");

        WebElement aramakutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramakutusu.sendKeys("Nutella");
        aramakutusu.submit();

        WebElement sonucYazisi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucYazisi.getText());

        driver.close();


    }
}
