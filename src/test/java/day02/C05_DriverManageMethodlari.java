package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://wisequarter.com");
        System.out.println("Ilk sayfa size: " + driver.manage().window().getSize());
        System.out.println("Ilk sayfanin konumu: " + driver.manage().window().getPosition());

        driver.manage().window().maximize();
        System.out.println("Maximize size degeri: " + driver.manage().window().getSize());
        System.out.println("Maximize konumu: " + driver.manage().window().getPosition());


       Thread.sleep(3000);
       driver.close();

    }
}
