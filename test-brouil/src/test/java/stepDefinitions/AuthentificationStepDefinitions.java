package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.messages.types.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AuthentificationStepDefinitions {

    private WebDriver driver;

    @Given("J'ouvre l'URL du site e-shop")
    public void ouvrirURLSiteEShop() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://shop-in.ovh/");
    }

    @And("L'utilisateur clique sur \"Boutique\"")
    public void utilisateurCliqueBoutique() {
        WebElement boutiqueLink = driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]"));
        boutiqueLink.click();
    }

    @And("L'utilisateur clique sur \"Ajouter au panier\"")
    public void utilisateurCliqueAjouterPanier() {
        WebElement ajouterPanierBtn = driver.findElement(By.xpath("//body/div[@id='main-container']/main[@id='main']/div[2]/section[1]/ul[1]/li[1]/a[1]"));
        ajouterPanierBtn.click();
    }

    @And("L'utilisateur clique sur \"Voir panier\"")
    public void utilisateurCliqueVoirPanier() {
        WebElement voirPanierBtn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/article[1]/div[3]/div[1]/div[2]/form[1]/div[1]/button[1]"));
        voirPanierBtn.click();
    }
  
   

    
   /*
    @And("L'utilisateur clique sur \"Verifier panier\"")
    public void utilisateurCliqueVerifierPanier() {
        WebElement verifierPanierBtn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/article[1]/div[3]/div[1]/div[2]/form[1]/div[1]/button[1]"));
        verifierPanierBtn.click();
    
   
    }/*
    


/*   Scenario: Ouvrir le site shop-in
  Given J'ouvre l'URL du site e-shop
  And L'utilisateur clique sur "Boutique"
  And L'utilisateur clique sur "Ajouter au panier"
  And L'utilisateur clique sur "Voir panier"
  And L'utilisateur clique sur "Verifier panier"
  And L'utilisateur clique sur "Valider les commandes"
  When L'utilisateur remplit les champs du formulaire de détails de facturation avec une nouvelle adresse e-mail inutilisée
  And L'utilisateur clique sur "Commander"      */

    /*

    @And("L'utilisateur clique sur \"Valider les commandes\"")
    public void utilisateurCliqueValiderCommandes() {
        WebElement validerCommandesBtn = driver.findElement(By.xpath("//button[contains(text(), 'Valider les commandes')]"));
        validerCommandesBtn.click();
    }
    
    */
    
    
    @And("L'utilisateur clique sur \"Valider les commandes\"")
    public void utilisateurCliqueValiderCommandes() {
        WebElement validerCommandesBtn = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/article[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]"));
        validerCommandesBtn.click();
    }


    @When("L'utilisateur remplit les champs du formulaire de détails de facturation avec une nouvelle adresse e-mail inutilisée")
    public void utilisateurRemplitChampsFacturation() {
    	
    	    // Remplir les champs du formulaire de détails de facturation
    	    WebElement champPrenom = driver.findElement(By.id("prenom"));
    	    champPrenom.sendKeys("Bouchra");

    	    WebElement champNom = driver.findElement(By.id("nom"));
    	    champNom.sendKeys("Maz");

    	    WebElement champAdresse = driver.findElement(By.id("adresse"));
    	    champAdresse.sendKeys("16 passage cardinet");

    	    WebElement champCodePostal = driver.findElement(By.id("code_postal"));
    	    champCodePostal.sendKeys("75017");

    	    WebElement champVille = driver.findElement(By.id("ville"));
    	    champVille.sendKeys("Paris");

    	    WebElement champPays = driver.findElement(By.id("pays"));
    	    champPays.sendKeys("France");

    	    WebElement champEmail = driver.findElement(By.id("email"));
    	    champEmail.sendKeys("parisismans@gmail.com");

    	    WebElement champIdentifiant = driver.findElement(By.id("identifiant"));
    	    champIdentifiant.sendKeys("maz");

    	    WebElement champMotDePasse = driver.findElement(By.id("mot_de_passe"));
    	    champMotDePasse.sendKeys("ajcajc1");

    	    // Vous pouvez continuer ainsi pour les autres champs du formulaire
    	}

    

    @And("L'utilisateur clique sur \"Commander\"")
    public void utilisateurCliqueCommander() {
        WebElement commanderBtn = driver.findElement(By.xpath("//button[contains(text(), 'Commander')]"));
        commanderBtn.click();
    }

    @Then("L'utilisateur est enregistré et connecté avec succès")
    public void utilisateurEnregistreConnecteSucces() {
        // Code pour vérifier que l'utilisateur est enregistré et connecté
    }

}



