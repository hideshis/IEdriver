package selenium.driver.ie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import static selenium.driver.ie.Common.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
     
        BrowserController browserController = new BrowserController();
        NotificationBarController notificationBarController = new NotificationBarController();

        browserController.startBrowsing();
        notificationBarController.saveFile();
        System.out.println("end of the main method");
    }

    
}
