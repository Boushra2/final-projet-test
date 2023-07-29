package stepDefinitions;



import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AuthentificationStepDefinitions {

    private WebDriver driver;

    @Given("J'ouvre l'URL du site e-shop")
    public void openAmazonWebsite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr/");
    }
}
