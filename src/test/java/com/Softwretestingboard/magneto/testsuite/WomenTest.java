package com.Softwretestingboard.magneto.testsuite;

import com.Softwretestingboard.magneto.customlisteners.CustomListeners;
import com.Softwretestingboard.magneto.pages.HomePage;
import com.Softwretestingboard.magneto.pages.WomenPage;
import com.Softwretestingboard.magneto.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {

    HomePage homePage;
    WomenPage womenPage ;
    @BeforeMethod(groups = {"smoke", "Sanity","regression"})
    public void inIT() {
        homePage = new HomePage();
        womenPage = new WomenPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        sleep(1000);
        // Mouse Hover on Women Menu
        homePage.clickOnWomenJackets();
        womenPage.sortByProductName();
        List<String> jacketsNameListBefore=womenPage.getJacketElements();
        List<String> jacketsNameListAfter=womenPage.getJacketElements();

        // Sort the before name list into Ascending Order
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsNameListBefore, jacketsNameListAfter);

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheSortByPriceFilter()throws InterruptedException {
        sleep(1000);
        homePage.clickOnWomenJackets();
        womenPage.sortByPrice();
        sleep(1000);

        List<String> jacketsPriceListBefore=womenPage.getPriceElements();
        List<String> jacketsPriceListAfter=womenPage.getPriceElements();

        Collections.sort(jacketsPriceListBefore);
        // Verify the products price display in Low to High
        Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);
    }


}
