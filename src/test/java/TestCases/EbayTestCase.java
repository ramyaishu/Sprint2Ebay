package TestCases;

import Common.BaseClass;
import PageClass.EbayHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EbayTestCase extends BaseClass
{
     //WebDriver driver;
    EbayHomePage ebay;
    @BeforeClass
    public void init()
    {
        ebay = PageFactory.initElements(driver,EbayHomePage.class);
    }
    @Test(priority = 1)
    public void verifyTitle()
    {
        ebay.getTitle();
    }


    @Test(priority = 2)
    public void verifyOptions() throws InterruptedException {
        Assert.assertFalse(ebay.findOptions());
    }




}
