package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_Locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon ana sayfaya gidiniz

        driver.get("https://www.amazon.com");

        // arama kutusunun yanindaki today's deals linkini tiklayin

        //WebElement todaysDealsElementi = driver.findElement(By.linkText("Angebote des Tages"));
        //WebElement todaysDealsElementi = driver.findElement(By.partialLinkText("Angebote"));
        WebElement todaysDealsElementi = driver.findElement(By.partialLinkText("Tages"));

        todaysDealsElementi.click();

        // acilan sayfada ilk urunu tiklayin

         Thread.sleep(3000);

          List<WebElement>urunElementleriListesi =driver.findElements(By.className("a-m-us a-aui_72554-c a-aui_accordion_a11y_role_354025-t1 a-aui_killswitch_csa_logger_372963-c a-aui_pci_risk_banner_210084-c a-aui_preload_261698-c a-aui_rel_noreferrer_noopener_309527-c a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c a-meter-animate"));

          urunElementleriListesi.get(0).click();


        Thread.sleep(3000);
        driver.close();
    }
}
