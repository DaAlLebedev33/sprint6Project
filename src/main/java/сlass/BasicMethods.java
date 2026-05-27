package сlass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BasicMethods {
    public WebDriver driver;

    public void setUp(String browser) {
        if (browser.equals("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.get("https://qa-scooter.education-services.ru/");
        } else if (browser.equals("Firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
            driver.get("https://qa-scooter.education-services.ru/");
        }
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
