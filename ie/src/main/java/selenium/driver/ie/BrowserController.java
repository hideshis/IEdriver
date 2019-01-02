package selenium.driver.ie;

import static selenium.driver.ie.Common.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrowserController implements Runnable{
	
	public void startBrowsing() {
		setDriver();
        driver.get("https://www.seleniumhq.org/download/");
        sleep(3000);
        
        Thread downloadThread = new Thread(this);
        downloadThread.start();
        sleep(3000);
        stopThread(downloadThread); // stop frozen thread
	}

	private void stopThread(Thread target) {
		target.interrupt();
	}

	private void clickDownloadLink() {
		WebElement download = driver.findElement(By.xpath("//*[@id='mainContent']/p[3]/a"));
        download.click();
	}

	private void sleep(int millisec) {
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Thread which just clicks download link. After the click, this thread will be frozen
	public void run() {
		System.out.println("ready to click donwload link");
		clickDownloadLink();
		System.out.println("donwload link is clicked");
	}
}
