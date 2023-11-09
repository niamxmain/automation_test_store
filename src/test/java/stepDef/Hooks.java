package stepDef;

import config.Env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Hooks extends Env {
    @Before
    public void before(){
        //DRIVER CHROME
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        driver = new ChromeDriver(opt);

        //DRIVER FIREFOX
//        WebDriverManager.firefoxdriver().setup();
//        FirefoxOptions opt = new FirefoxOptions();
//        driver = new FirefoxDriver(opt);
        //Driver edge
//        WebDriverManager.edgedriver().setup();
//        EdgeOptions opt = new EdgeOptions();
//        driver = new EdgeDriver(opt);

        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @After
    public void after() {
        driver.quit();
    }
}
