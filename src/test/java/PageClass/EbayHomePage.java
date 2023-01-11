package PageClass;

import Common.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EbayHomePage
{
    WebDriver driver;

    @FindBy(id = "gh-ac")
    WebElement searchBox;
    @FindBy(id = "gh-cat")
    WebElement allCategories;

    public EbayHomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public boolean findOptions() throws InterruptedException {
        ArrayList<String > list = new ArrayList<>();
        ArrayList<String > list1 = new ArrayList<>();
        allCategories.click();
        Thread.sleep(1000);
        Select select = new Select(allCategories);
        List<WebElement> options = select.getOptions();
        System.out.println("Options Size : "+options.size());
        for(WebElement e:options)
        {
            String text = e.getText();
            System.out.println("Options are  :"+text);
            list.add(text);
            list1.add(text);
        }
      Collections.sort(list);
        if(list.equals(list1))
        {
            System.out.println("Items in the menus are Equal");
        }
        else
            System.out.println("Not equal");
        return list.equals(list1);
    }

    public String getTitle()
    {
        System.out.println(driver.getTitle());
        return driver.getTitle();
    }


}
