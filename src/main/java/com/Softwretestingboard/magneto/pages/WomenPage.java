package com.Softwretestingboard.magneto.pages;

import com.Softwretestingboard.magneto.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WomenPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement sortBy ;

    @CacheLookup
    @FindBy(xpath ="//strong[@class='product name product-item-name']//a")
    List<WebElement> jacketElements;

    @CacheLookup
    @FindBy(xpath ="//span[@class='price-wrapper ']//span")
    List<WebElement> priceElements ;

    public void sortByProductName() {
        selectByVisibleTextFromDropDown(sortBy, "Product Name");
    }

    public List<String> getJacketElements() {
        List<String> jacketsNameList = new ArrayList<>();
        for (WebElement value : jacketElements) {
            jacketsNameList.add(value.getText());
        }
        return jacketsNameList;
    }



    public void sortByPrice() {
        selectByVisibleTextFromDropDown(sortBy, "Price");
    }
    public List<String> getPriceElements() {
        List<String> priceList = new ArrayList<>();
        for (WebElement price : priceElements) {
            priceList.add(price.getText());
        }
        return priceList;
    }

}
