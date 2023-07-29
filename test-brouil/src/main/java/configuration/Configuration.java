package configuration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Configuration {

    private WebDriver driver;

    public Configuration(WebDriver driver) {
        this.driver = driver;
    }

    public void goToAmazon() {
        // Utilisation de WebDriverManager pour configurer automatiquement le pilote Chrome
        WebDriverManager.chromedriver().setup();

        // Configuration du navigateur pour qu'il soit visible
        driver = new ChromeDriver();

        // Accéder au site Amazon
        driver.get("https://www.amazon.fr/");
    }
}






