package title;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHome extends CommonAPI {
    @Test
    public void test(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

}
