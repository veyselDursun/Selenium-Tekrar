package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverOtomatikKullanma {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("NewDriver.chroma.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        Thread.sleep(5000);

        driver.get("https://www.amazon.com");

        Thread.sleep(3000);
        driver.close();



    }
}

