package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import core.Base;

public class DesktobspageObj extends Base {
	
	
public DesktobspageObj(){
	PageFactory.initElements(driver, this);
  
}
//S1==>xpath
@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
private WebElement retailWebsiteText;
@FindBy(xpath="//a[text()='Desktops']")
private WebElement desktoplink;
@FindBy(xpath="//a[text()='Show All Desktops']")
private WebElement showAllDesktopLink;
@FindBy(xpath="//h2[text()='Desktops']")
private WebElement desktopItems;
//S2==>XPATH
@FindBy(xpath="//div[@class='col-sm-9']//child::div[3]//child::Span[@class='hidden-xs hidden-sm hidden-md']")
private WebElement AddtoCartButton;
@FindBy(xpath="//input[@name='quantity']")
private WebElement quantityField;
@FindBy(xpath="//button[@id='button-cart']")
private WebElement AddtoCart2;
@FindBy(xpath="//body//div[@class='alert alert-success alert-dismissible']")
private WebElement sucessMessageFordesktop;

//S3
@FindBy(xpath="//div[@id='content']//child::div[1]//child::span[@class='hidden-xs hidden-sm hidden-md']//following::span[4]")
private WebElement AddToCartForCanon;
@FindBy(xpath="//select[@id='input-option226']")
private   WebElement RedDropdown;
@FindBy(xpath="//input[@name='quantity' and @id='input-quantity']")
private WebElement quantityFieldCnon;
@FindBy(xpath="//button[@id='button-cart']")
 private WebElement AddtoCartCanon2;
@FindBy(xpath="//div[@id='product-product']//following::div[@class='alert alert-success alert-dismissible']")
private WebElement successMessageForCanon;


//S4=================
@FindBy(xpath="//a[text()='Reviews (0)']")
private WebElement reviewLink;
@FindBy(xpath="//input[@id='input-name']")
private WebElement nameOnReviewField;
@FindBy(xpath="//textarea[@id='input-review']")
private WebElement reviewfield;
@FindBy(xpath="//input[@name='rating' and @value='4']")
private WebElement ratingRadioButton;
@FindBy(xpath="//button[text()='Continue']")
private WebElement continueButtonForreview;
@FindBy(xpath="//body//div[@class='alert alert-success alert-dismissible']")
private WebElement successMessageForReview;


//s1==>Methods
public String getRetailWebSiteText(){
	 String getTextFromUI=retailWebsiteText.getText();
	 return getTextFromUI;
}

public void clickOnDesktopLink(){
	desktoplink.click();
}
public void clickOnshowAllDesktopLink(){
	showAllDesktopLink.click();
	
}
public String getTextAfterLoginToShowAll(){
	String  desktopText=desktopItems.getText();
	return desktopText;
	//S2===>mETHODS
}
public void clickOnAddToCartButton(){
	AddtoCartButton.click();
}
public void enterQuantityNumbers(String numbers){
	quantityField.sendKeys("numbers");
}
public void clickOnAddtoCartButton2(){
	AddtoCart2.click();
}
 public String getSuccessMessageFordesktop(){
	 String text=sucessMessageFordesktop.getText();
	 return text;

}
 //s3=========================================>Methods 
 public void clickOnAddToCartCanon(){
	 AddToCartForCanon.click();
		 
 }
 public  void selectRedFromDD(String visibleText){
	Select select=new Select(RedDropdown);
	select.selectByVisibleText(visibleText);

			}
 public void enterQuantityNumbersCanon(String numbers){
	 quantityFieldCnon.sendKeys("1");
	 
	 
 }
 public void clickOnAddtoCartCanon2(){
	 AddtoCartCanon2.click();
 }
 public String getSucessMessageCanon(){
	 String text=successMessageForCanon.getText();
	 return text;
	 

	
}
 public void clickOnReviewLink(){
	 reviewLink.click();
 }
 public void enterYourNameOnReview(String name){
	 nameOnReviewField.sendKeys("Hadia");
	 
 }
 public void enterYourReview(String review){
	 reviewfield.sendKeys("This application has alot of satisifying features and I am so happy to use this app");
 }
 public void clickOnRatingChechBox(String rating){
	 ratingRadioButton.click();
	 
 }
 public void clickOnContinueBttnForReview(){
	 continueButtonForreview.click();
	 
 }
 public String getSuccessMessageForReview(){
	 String text=successMessageForReview.getText();
	 return text;
 }
}