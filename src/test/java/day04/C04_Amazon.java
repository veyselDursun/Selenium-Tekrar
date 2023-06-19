package day04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Amazon {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedIcerik = "Spend less";
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Amazon Title testi PASSED");

        }else {
            System.out.println("Amazon Title testi FAILED");

        }
        //6- Gift Cards sekmesine basin


        //7- Birthday butonuna basin


        //8- Best Seller bolumunden ilk urunu tiklayin


        //9- Gift card details’den 25 $’i secin


        //10-Urun ucretinin 25$ oldugunu test edin


        //11-Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
