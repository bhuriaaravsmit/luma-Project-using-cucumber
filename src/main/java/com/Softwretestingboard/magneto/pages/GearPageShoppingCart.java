package com.Softwretestingboard.magneto.pages;

import com.Softwretestingboard.magneto.customlisteners.CustomListeners;
import com.Softwretestingboard.magneto.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPageShoppingCart extends Utility {

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement productQty;


   // @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement totalPrice ;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart ;

    public WebElement getProductName() {

        CustomListeners.test.log(Status.PASS,"getProductName");
        return productName;
    }

    public WebElement getTotalPrice() {
        CustomListeners.test.log(Status.PASS,"getTotalPrice");
        return totalPrice;
    }

    public WebElement getProductQty() {

        CustomListeners.test.log(Status.PASS,"getProductQty");
        return productQty;
    }

    public void clickOnProductName(){
        clickOnElement(productName);
        CustomListeners.test.log(Status.PASS,"clickOnProductName");
    }

    public void updateQty(String qty){
        sendTextToElement(productQty,qty);
        clickOnElement(updateShoppingCart);

        CustomListeners.test.log(Status.PASS,"Enter Quantity" +5);
    }

}
