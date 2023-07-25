package com.Softwretestingboard.magneto.pages;

import com.Softwretestingboard.magneto.customlisteners.CustomListeners;
import com.Softwretestingboard.magneto.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement productName;



    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overnightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changedQty;


    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement overnightDuffleMessage ;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink ;


    public void clickOnProductName(){
        clickOnElement(productName);
        CustomListeners.test.log(Status.PASS,"clickOnProductName");
    }

    public WebElement getOvernightDuffleText() {
        return overnightDuffleText;
    }

    public void changeQuantityAddtoCart(String qty) {

        sendTextToElement(changedQty,qty);
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS,"changeQuantityAddtoCart");
    }



    public WebElement getOvernightDuffleMessage() {
        return overnightDuffleMessage;
    }

    public void clickOnCartLink(){

        clickOnElement(shoppingCartLink);

        CustomListeners.test.log(Status.PASS,"clickOnCartLink");

    }

}
