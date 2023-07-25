package com.Softwretestingboard.magneto.pages;

import com.Softwretestingboard.magneto.customlisteners.CustomListeners;
import com.Softwretestingboard.magneto.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement women ;

    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement jackets ;
    // Mouse Hover on Tops

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement men ;
    // Mouse Hover on Bottoms
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-18']")
    WebElement bottoms ;
    // Click on Pants
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants ;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gear ;
    // Click on Bags
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags ;
    // Click on Product Name ‘Overnight Duffle’


    public void clickOnWomenJackets() {
        mouseHoverToElement(women);
        mouseHoverToElement(tops);
        mouseHoverToElementAndClick(jackets);
        CustomListeners.test.log(Status.PASS,"clickOnWomenJackets");
    }

    public void clickOnMensPants() {

        mouseHoverToElement(men);
        mouseHoverToElement(bottoms);
        mouseHoverToElementAndClick(pants);
        CustomListeners.test.log(Status.PASS,"clickOnMensPants");

    }

    public void clickOnGearBags() {
        mouseHoverToElement(gear);
        mouseHoverToElementAndClick(bags);
        CustomListeners.test.log(Status.PASS,"clickOnGearBags");
    }

}