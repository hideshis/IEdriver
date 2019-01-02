package selenium.driver.ie;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import static selenium.driver.ie.Common.*;

public class NotificationBarController{
	Robot keyboard;
	
	public void saveFile() {
		declareVariable();
		pressAndRelease(KeyEvent.VK_ALT, KeyEvent.VK_N);
		pressAndRelease(KeyEvent.VK_TAB);
		pressAndRelease(KeyEvent.VK_SPACE);
	}
	
	private void sleep(int millisec) {
		try {
			Thread.sleep(millisec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void declareVariable() {
		try {
			keyboard = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void pressAndRelease(int key) {
		keyboard.keyPress(key);
		pause(500);
		keyboard.keyRelease(key);
		pause(500);
	}
	
	private void pressAndRelease(int key1, int key2) {
		keyboard.keyPress(key1);
		pause(500);
		keyboard.keyPress(key2);
		keyboard.keyRelease(key1);
		keyboard.keyRelease(key2);
		pause(500);
	}
}
