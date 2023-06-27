package teamTekrar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import static org.openqa.selenium.devtools.v110.profiler.Profiler.stop;

public class T03 extends TestBase {

    @Test
    public void test01() {
        //a. Verilen web sayfasına gidin.
        //https://facebook.com
        driver.get("https://facebook.com");

        //b. Cookies’i kabul edin
        driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        stop();

        //c. Create an account buton’una basin
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        //d. Radio button elementlerini locate edin ve size uygun olani secin
        WebElement womenElement = driver.findElement(By.xpath("//input[@value='1']"));
        WebElement manElemet = driver.findElement(By.xpath("//input[@value='2']"));
        WebElement customElement = driver.findElement(By.xpath("//input[@value='-1']"));
    }
}
