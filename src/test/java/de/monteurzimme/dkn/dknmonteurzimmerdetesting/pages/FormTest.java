package de.monteurzimme.dkn.dknmonteurzimmerdetesting.pages;

import de.monteurzimme.dkn.dknmonteurzimmerdetesting.utility.TestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(TestListener.class)
public class FormTest extends BaseTest {

    private void openForm() {
        Form formPage = new Form(driver);
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage("https://dkn-monteurzimmer.de/#Bewertungen");
    }

    @Test
    public void openFormTest() {
        openForm();
        String expectedUrl = "https://dkn-monteurzimmer.de/#Bewertungen";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

    }

    @Test
    public void fillForm() {
        Form formPage = new Form(driver);
        openForm();
        formPage.fillForm("Test", "Test", "TEST", "TEST",
                "TEST", "TEST");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String xpathLocator = "//div[@class='popup__text-block']";

        WebElement popupTextBlock = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));

        Assert.assertTrue(popupTextBlock.isDisplayed(), "The element is not visible.");

    }

}
