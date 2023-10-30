package stepDef;

import config.Env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks extends Env {
    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        driver = new ChromeDriver(opt);

        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @After
    public void after() {
        driver.quit();
    }
}
