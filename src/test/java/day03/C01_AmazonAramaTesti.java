package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.time.Duration;

public class C01_AmazonAramaTesti {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();

        WebElement aramaSonucElementi =driver.findElement(By.className("sg-col-inner"));

        // System.out.println(aramaSonucElementi);

        System.out.println(aramaSonucElementi.getText());

        String expectedIcerik = "Nutella";
        String actualSonucYazisi = aramaSonucElementi.getText();

        if (actualSonucYazisi.contains(expectedIcerik)){
            System.out.println("Nutella arama Testi PASSED");
        }else{
            System.out.println("Nutella arama Testi FAILED");
        }


        Thread.sleep(5000);
        driver.close();
    }
}
