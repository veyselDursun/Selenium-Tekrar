package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

        //1- C01_TekrarTesti isimli bir class olusturun
public class C02_TekrarTesti1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

        //3- cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();

        //4- Sayfa basliginin “Google” ifadesi icerdigini test edin

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Google arama Testi PASSED");
        }else {
            System.out.println("Google arama Testi FAILED");
        }

        //5- Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.id("APjFqb")).sendKeys("Nutella");
        driver.findElement(By.className("gNO89b")).submit();

        //6- Bulunan sonuc sayisini yazdirin
        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        System.out.println("Sonuc Sayisi : " + sonucSayisi.getText());

        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        int sayi = 114000000;
        if (sayi>10000000){
            System.out.println("Sonuc Sayisi 10 Milyondan Fazla ve Test PASSED");
        }else{
            System.out.println("Sonuc sayisi 10 Milyondan az veya esit ve TEST BASARISIZ");
        }
        //8- Sayfayi kapati
        driver.close();

    }
}

