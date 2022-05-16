package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void check() {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://google.com");
        assert true;
        chromeDriver.quit();
    }
}
