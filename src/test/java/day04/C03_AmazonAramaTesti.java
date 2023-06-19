package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_AmazonAramaTesti {

        public static void main(String[] args) {

            //1- Bir test class’i olusturun ilgili ayarlari yapin
            System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            //2- https://www.amazon.com adresine gidin
            driver.get("https://www.amazon.com");

            //3- amazon arama kutusunu locate edin
            driver.findElement(By.id("twotabsearchtextbox"));

            //4- arama kutusuna “Nutella” yazdirin
            //5- arama islemini yapabilmek icin ENTER tusuna basin
            WebElement nutella= driver.findElement(By.id("twotabsearchtextbox"));
            nutella.sendKeys("Nutella"+ Keys.ENTER);
        }



}
