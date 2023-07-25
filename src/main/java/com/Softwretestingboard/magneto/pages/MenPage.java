package com.Softwretestingboard.magneto.pages;

import com.Softwretestingboard.magneto.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement size ;
    // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    @CacheLookup
    @FindBy(xpath ="(//div[@class='swatch-option color'])[1]")
    WebElement colour ;
    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement cart ;

    @CacheLookup
    @FindBy(xpath ="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement text;

    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink ;



    public void selectAndClickCronusYogaPant() {

        mouseHoverToElement(productName);
        mouseHoverToElementAndClick(size);
        mouseHoverToElementAndClick(colour);
        mouseHoverToElementAndClick(cart);

    }

    public WebElement getText() {
        return text;
    }


    public String getTheText() {
        return getTextFromElement(text);
    }

    public void clickOnCartLink(){

        clickOnElement(shoppingCartLink);

    }



}
