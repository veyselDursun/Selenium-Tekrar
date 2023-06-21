package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gc']")).click();


        //7- Birthday butonuna basin
        driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2020/March/GiftCards/LP_GiftCards_Birthday_de_DE._CB435178558_.jpg']")).click();


        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Geschenkkarte'])[3]")).click();


        //9- Gift card details’den 25 $’i secin

        driver.findElement(By.xpath("//button[@id='gc-mini-picker-amount-1' and @value='25']")).click();


        //10-Urun ucretinin 25$ oldugunu test edin

        //WebElement ucretElementi = driver.findElement(By.cssSelector("#gc-live-preview-amount")); // cssSelector ile
        WebElement ucretElementi = driver.findElement(By.xpath("//span[@id='gc-live-preview-amount']"));

        String expecteducret = "25$";
        String actualUcret = ucretElementi.getText();
        if (expecteducret.equals(actualUcret)){
            System.out.println("Urun ucret testi PASSED");

        }else{
            System.out.println("Urun ucret testi FAILED");
        }

        //11-Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
