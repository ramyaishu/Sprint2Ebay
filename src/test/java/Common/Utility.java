package Common;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility extends BaseClass
{
    public WebDriverWait wait;

    public Utility()
    {
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitTimes(long time)
    {
        try {
            Thread.sleep(time);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
