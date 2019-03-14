package click;

import base.CommonAPI;
import org.testng.annotations.Test;

public class ClickTest extends CommonAPI {
    @Test
    public void clickTest1(){
        clickByXpath("//a[contains(text(),\"Today's Deals\")]");

    }
}
