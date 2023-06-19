package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_xpath_test {

        public static void main(String[] args) throws InterruptedException {

            //Bir onceki sorudaki tum locate'leri text ile yapalim

            System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
            driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

            // 2- Add Element butonuna basin
            driver.findElement(By.xpath("//*[text()='Add Element']")).click();

            // 3- Delete butonu’nun gorunur oldugunu test edin
            WebElement deletButon = driver.findElement(By.xpath("//*[text()='Delete']"));
            if (deletButon.isDisplayed()){
                System.out.println("Delete butonu gorunme testi PASSED");
            }else {
                System.out.println("Delete butonu gorunme testi FAILED");
            }
            Thread.sleep(2000);
            // 4- Delete tusuna basin
            deletButon.click();

            // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
            WebElement addRemoveElement = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
            //WebElement addRemoveElement = driver.findElement(By.tagName("h3"));
            if (addRemoveElement.isDisplayed()){
                System.out.println("Add Remove testi PASSED");
            }else {
                System.out.println("Add Remove testi FAILED");
            }

            Thread.sleep(2000);
            driver.close();
    }
}
