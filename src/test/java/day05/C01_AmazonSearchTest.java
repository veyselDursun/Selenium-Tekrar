package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AmazonSearchTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");

        //2- arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        //3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones");
        aramaKutusu.submit();

        //4- Bulunan sonuc sayisini yazdiralim
        driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col-18-of-24 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']"));

        //5- Ilk urunu tiklayalim

        driver.findElement(By.xpath("//div[@class='s-desktop-width-max sg-row-align-items-center s-wide-grid-style-t3 s-wide-grid-style sg-row']")).click();

        //6- Sayfadaki tum basliklari yazdiralim




    }


}
