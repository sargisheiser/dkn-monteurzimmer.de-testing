package de.monteurzimme.dkn.dknmonteurzimmerdetesting.pages;

import de.monteurzimme.dkn.dknmonteurzimmerdetesting.locators.HomePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By furVermieter = By.xpath(HomePageLocators.FUR_VERMIETER);
    private final By uberUns = By.xpath(HomePageLocators.UBER_UNS);
    private final By unterkuft = By.xpath(HomePageLocators.UNTERKUFT);
    private final By ihreVorteile = By.xpath(HomePageLocators.IHRE_VORTEILE);
    private final By statistiks = By.xpath(HomePageLocators.STATISTIKS);
    private final By unserTeam = By.xpath(HomePageLocators.UNSER_TEAM);
    private final By bewertungen = By.xpath(HomePageLocators.BEWERTUNGEN);
    private final By unverbindlicheAnfrage = By.xpath(HomePageLocators.UNVERBINDLICHE_ANFRAGE);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void getHomePage(String url) {
        driver.get(url);
    }

    public void furVermieter() {
        click(furVermieter);
    }

    public void uberUns() {
        click(uberUns);
    }

    public void unterkuft() {
        click(unterkuft);
    }

    public void ihreVorteile() {
        click(ihreVorteile);
    }

    public void statistiks() {
        click(statistiks);
    }

    public void unserTeam() {
        click(unserTeam);
    }

    public void bewertungen() {
        click(bewertungen);
    }

    public void unverbindlicheAnfrage() {
        click(unverbindlicheAnfrage);
    }

    public void footerIG() {
        click(By.xpath("//a[@href='https://www.instagram.com/check_zimmer/' and contains(@class, 'cont__social')]"));
    }

    public void footerFB() {
        click(By.xpath("//a[@href='https://www.facebook.com/DKN-Immobilien-114358053685588' and contains(@class, 'cont__social')]"));
    }

    public void footerAGB(){
        click(By.xpath("//a[@href='agb.html' and contains(@class, 'popup-scroll') and contains(@class, 'agb-scroll')]"));
    }

    public void footerImpressum(){
        click(By.xpath("//a[@href='impressum.html' and contains(@class, 'popup-scroll') and contains(@class, 'impressum-scroll')]"));
    }

    public void footerDaten(){
        click(By.xpath("//a[@href='datenschutz.html' and contains(@class, 'popup-scroll') and contains(@class, 'datenschutz-scroll')]"));
    }



}
