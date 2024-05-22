package de.monteurzimme.dkn.dknmonteurzimmerdetesting.pages;


import de.monteurzimme.dkn.dknmonteurzimmerdetesting.urls.Links;
import de.monteurzimme.dkn.dknmonteurzimmerdetesting.utility.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class HomePageHeaderTest extends BaseTest {

    @Test
    public void furVermieter() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.furVermieter();
        String expectedUrl = "https://dkn-monteurzimmer.de/#Verwaltungsservice";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void uberUns() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.uberUns();
        String expectedUrl = "https://dkn-monteurzimmer.de/#%C3%9Cber_uns";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void unterkunft() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.unterkuft();
        String expectedUrl = "https://dkn-monteurzimmer.de/#Unterkunft";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void ihreVorteile() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.ihreVorteile();
        String expectedUrl = "https://dkn-monteurzimmer.de/#Ihre_Vorteile";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void statistiks() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.statistiks();
        String expectedUrl = "https://dkn-monteurzimmer.de/#Zahlen_und_Fakten";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void unserTeam() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.unserTeam();
        String expectedUrl = "https://dkn-monteurzimmer.de/#Verf%C3%BCgbare_Objektein_ganz_Deutschland";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void bewertugen() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.bewertungen();
        String expectedUrl = "https://dkn-monteurzimmer.de/#Unser_Team";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void unverbindlicheAnfrage() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage(Links.BASE_PAGE);
        homePage.unverbindlicheAnfrage();
        String expectedUrl = "https://dkn-monteurzimmer.de/#Bewertungen";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }


    @Test
    public void footerIG() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage("https://dkn-monteurzimmer.de/#Bewertungen");
        homePage.footerIG();
        Assert.assertTrue(driver.getCurrentUrl().contains("instagram.com"));
    }

    @Test
    public void footerFB() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage("https://dkn-monteurzimmer.de/#Bewertungen");
        homePage.footerFB();
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com"));
    }

    @Test
    public void footerAGB() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage("https://dkn-monteurzimmer.de/#Bewertungen");
        homePage.footerAGB();
        String expectedUrl = "https://dkn-monteurzimmer.de/agb.html";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test
    public void footerImpressum() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage("https://dkn-monteurzimmer.de/#Bewertungen");
        homePage.footerImpressum();
        String expectedUrl = "https://dkn-monteurzimmer.de/impressum.html";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }


    @Test
    public void footerDaten() {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage("https://dkn-monteurzimmer.de/#Bewertungen");
        homePage.footerDaten();
        String expectedUrl = "https://dkn-monteurzimmer.de/datenschutz.html";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

}
