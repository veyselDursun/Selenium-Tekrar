package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);
        System.out.println(driver.getTitle());

        String expectedIcerik = "Wise";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title Wise icermiyor, Test FAILED");
        }

        String expectedUrl = "https://www.wisequqrter.com";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("URL testi PASSED");
        }else{
            System.out.println("URL Test FAILED");
            System.out.println("Actual URL " + actualUrl);
        }

        System.out.println(driver.getPageSource()); // sayfa kaynagini getiriyor

        System.out.println(driver.getWindowHandle()); // Her olusturulan Browser icin unigue bir window handle degeri atanir.
                                                      // Bu handle degeri sayfalar arasinda gecis yapmak icin kullanilir
                                                        // handle degeri getirir


        System.out.println(driver.getWindowHandles());// set olarak bize dondurur

        driver.close();
    }

}
