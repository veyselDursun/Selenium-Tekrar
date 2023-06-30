package Youtube_Tekrar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestAfterbefore {

     WebDriver driver;

     @Before  //BeforeClass olarak da kullanilir
    public void setUp(){
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

     }

    @Test
    public void test01(){

        driver.get("https://www.amazon.com");

    }

    @Test
    public void test02(){

        driver.get("https://www.facebook.com");

    }

    @Test @Ignore //istemedigimiz methodu ignore edebiliriz
    public void test03(){

        driver.get("https://www.wisequarter.com");

    }

     @After //AfterClass olarakda kullanilabilir
    public void tearDown(){

        driver.close();

    }
}
