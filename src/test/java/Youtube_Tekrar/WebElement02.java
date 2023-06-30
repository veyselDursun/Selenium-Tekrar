package Youtube_Tekrar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement02 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        WebElement ePostaKutusu = driver.findElement(By.xpath("//input[@name='email']"));
        ePostaKutusu.sendKeys("hgfjgjhkkhk");

        WebElement passKutusu = driver.findElement(By.xpath("//input[@name='pass']"));
        passKutusu.sendKeys("werrtzzu");

        driver.findElement(By.xpath("//button[@name='login']")).click();

        WebElement sonucYazielementi = driver.findElement(By.xpath("//div[@class='_9ay7']"));
        String expectedSonucYazi ="Die eingegebene E-Mail-Adresse oder Handynummer ist mit keinem Konto verknüpft. Konto finden und anmelden.";
        String actualSonucYazi = sonucYazielementi.getText();

        if (expectedSonucYazi.equals(actualSonucYazi)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }


        driver.close();

    }
}
