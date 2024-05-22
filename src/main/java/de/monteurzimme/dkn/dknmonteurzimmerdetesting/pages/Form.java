package de.monteurzimme.dkn.dknmonteurzimmerdetesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Form extends BasePage {

    private final By firmenName = By.xpath("//div[@class='input-block']/input[@name='firmenname']");
    private final By telefon = By.xpath("//div[@class='input-block']//input[@name='telefon']");
    private final By vorNachName = By.xpath("//div[@class='input-block']//input[@name='nachname' and @id='nachname']");
    private final By email = By.xpath("//div[@class='input-block']//input[@name='email' and @id='email']");
    private final By person = By.xpath("//div[@class='input-block']//input[@name='personenanzahl' and @id='personenanzahl']");
    private final By nachricht = By.xpath("//textarea[@name='message']");
    private final By ichStimme = By.xpath("//div[@class='check-block']//input[@class='vcheck' and @type='checkbox' and @name='personlichen' and @value='1' and @id='personlichen']");
    private final By senden = By.xpath("//div[contains(@class, 'btn') and contains(@class, 'filled') and contains(@class, 'popup-thanks') and contains(@class, 'disabled') and text()='Senden']");


    public Form(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String name, String phone, String vorname, String emailI, String personI,
                         String message) {

        WebElement nameInput = driver.findElement(firmenName);
        nameInput.sendKeys(name);

        WebElement phoneInput = driver.findElement(telefon);
        phoneInput.sendKeys(phone);

        WebElement vornameInput = driver.findElement(vorNachName);
        vornameInput.sendKeys(vorname);

        WebElement emailInput = driver.findElement(email);
        emailInput.sendKeys(emailI);

        WebElement personInput = driver.findElement(person);
        personInput.sendKeys(personI);

        WebElement messageInput = driver.findElement(nachricht);
        messageInput.sendKeys(message);

        click(By.xpath("//input[@class='vcheck' and @type='checkbox' and @name='personlichen']"));
        click(senden);

    }
}
