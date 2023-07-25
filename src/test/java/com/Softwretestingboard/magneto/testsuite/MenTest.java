package com.Softwretestingboard.magneto.testsuite;

import com.Softwretestingboard.magneto.customlisteners.CustomListeners;
import com.Softwretestingboard.magneto.pages.HomePage;
import com.Softwretestingboard.magneto.pages.MenPage;
import com.Softwretestingboard.magneto.pages.ShoppingCart;
import com.Softwretestingboard.magneto.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {
    HomePage homePage ;
    MenPage menPage ;

    ShoppingCart shoppingCart ;

    @BeforeMethod(groups = {"smoke", "Sanity","regression"})
    public void inIT() {
        homePage = new HomePage();
        menPage = new MenPage();
        shoppingCart = new ShoppingCart();

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyCartDetails() throws InterruptedException {
        sleep(2000);
        homePage.clickOnMensPants();
        menPage.selectAndClickCronusYogaPant();
        sleep(2000);
        //verify the text
        verifyText(menPage.getText(), "You added Cronus Yoga Pant to your shopping cart.");


        menPage.clickOnCartLink();
        sleep(2000);
        verifyText(shoppingCart.getCartText(),"Shopping Cart");
        verifyText(shoppingCart.getProductName(),"Cronus Yoga Pant");
        verifyText(shoppingCart.getProductColour(),"Black");
        verifyText(shoppingCart.getProductSize(),"32");


    }

}
