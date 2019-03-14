package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.Key;

public class SearchTest extends CommonAPI {

    @Test
    public void search(){
     typeOnId("twotabsearchtextbox","laptops");
    }
    @Test
    // SEARCH USING CSS METHOD WE NEED TO PUT # BEFORE THE ID "#twotabsearchtextbox"
    public void searchCSS(){
        typeOnCSS("#twotabsearchtextbox","laptops");
    }
    @Test
    public void search2 (){
        // the next test will fail because we didn't put # before id.
        // so it will use the next method we have in search2 in commonAPI
        typeOnWebElement("twotabsearchtextbox","phones");
    }



}
