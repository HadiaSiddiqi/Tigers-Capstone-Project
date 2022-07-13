package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.Base;

public class Utils  extends Base{

	public static  void hoverMouseOverElement(WebElement element){
		Actions actions=new Actions(driver);
		actions.moveToElement(element);
		
	}
	public static String getTextFromUI(WebElement element){
		String textFromUI=element.getText();
		return textFromUI;
	}
		public static void clickOnRadioButton(WebElement element) {
			try {
				if(element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
					element.click();
				}else {
				System.out.println("One of the conditions did not return expected velue");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
			public static void clickOnCheckBoxButton(WebElement element) {
				try {
					if(element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
						element.click();
					}else {
					System.out.println("One of the conditions did not return expected velue");
					}
				} catch (Exception e) {
					e.printStackTrace();
				
				}
		
			}
			public static void takeScreenShot(String fileName) throws IOException {
				// we need to create a folder at project level and store the path here so that
				// when even we take screenshots, they are all saved in that specific folder
				String path = ".\\screenshots\\";
				// I create object of the file class
				File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// After taking the screenshot, take the file and store it in a location in my
				// computer
				// and also I want to provide the file_name and the extension
				try {
					FileUtils.copyFile(file, new File(path + fileName + ".png"));
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("takeScreenshot: => Exception was throw during execution");
				}
			}
}
