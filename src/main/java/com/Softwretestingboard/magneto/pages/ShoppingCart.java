package com.Softwretestingboard.magneto.pages;

import com.Softwretestingboard.magneto.customlisteners.CustomListeners;
import com.Softwretestingboard.magneto.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends Utility {


    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement cartText ;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName ;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSize ;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productColour ;

    public WebElement getCartText() {
        CustomListeners.test.log(Status.PASS,"getCartText");
        return cartText;
    }

    public WebElement getProductName() {
        CustomListeners.test.log(Status.PASS,"getProductName");
        return productName;
    }

    public WebElement getProductSize() {
        CustomListeners.test.log(Status.PASS,"getProductSize");
        return productSize;
    }

    public WebElement getProductColour() {
        CustomListeners.test.log(Status.PASS,"getProductColour");
        return productColour;
    }

}
