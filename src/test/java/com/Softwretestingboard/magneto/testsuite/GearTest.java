package com.Softwretestingboard.magneto.testsuite;

import com.Softwretestingboard.magneto.customlisteners.CustomListeners;
import com.Softwretestingboard.magneto.pages.GearPage;
import com.Softwretestingboard.magneto.pages.GearPageShoppingCart;
import com.Softwretestingboard.magneto.pages.HomePage;
import com.Softwretestingboard.magneto.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {

    HomePage homePage ;
    GearPage gearPage ;

    GearPageShoppingCart gearPageShoppingCart;

    @BeforeMethod(groups = {"smoke", "Sanity","regression"})
    public void inIT() {
        homePage = new HomePage();
        gearPage = new GearPage();
        gearPageShoppingCart = new GearPageShoppingCart();

    }


    @Test(groups = {"smoke", "regression"})
    public void verifyTheOvernightDuffle() {

        sleep(3000);
        homePage.clickOnGearBags();
        gearPage.clickOnProductName();
        sleep(2000);
        verifyText(gearPage.getOvernightDuffleText(), "Overnight Duffle");

        sleep(2000);
        gearPage.changeQuantityAddtoCart("3");
        sleep(2000);
        verifyText(gearPage.getOvernightDuffleMessage(), "You added Overnight Duffle to your shopping cart.");
        gearPage.clickOnCartLink();

        sleep(4000);
        verifyText(gearPageShoppingCart.getProductName(), "Overnight Duffle");
        Assert.assertEquals("3",  getAttributeValue(gearPageShoppingCart.getProductQty(), "value"));
        verifyText(gearPageShoppingCart.getTotalPrice(), "$135.00");


        gearPageShoppingCart.updateQty("5");
        sleep(4000);
        verifyText(gearPageShoppingCart.getTotalPrice(), "$222.00");



    }



}
