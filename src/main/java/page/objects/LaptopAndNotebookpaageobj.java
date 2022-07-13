package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopAndNotebookpaageobj extends Base {
	
	public LaptopAndNotebookpaageobj(){
		PageFactory.initElements(driver, this);
			}
	//xpath1====================================================>
@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
private WebElement retailWebsitetext;
@FindBy(xpath="//a[text()='Laptops & Notebooks']")
private WebElement laptopandNotebookslink;
@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
private WebElement showAllLaptopandNotebooklink;
@FindBy(xpath="//a[text()='MacBook']")
private WebElement macBookItemLink;
@FindBy(xpath="//button[@id='button-cart']")
private WebElement addTOCartbttnForMacbook;
@FindBy(xpath="//body//div[@class='alert alert-success alert-dismissible']")
private WebElement successMMessageForMacbook;
@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
private WebElement items602showedinCart;
@FindBy(xpath="//strong//i[@class='fa fa-shopping-cart']")
private WebElement viewCartBttn;
@FindBy(xpath="//button[@class='btn btn-danger']")
private WebElement Removebutton;
@FindBy(xpath="//span[text()='0 item(s) - $0.00']")
private WebElement showsZero;

//xpath2=============================================================>
@FindBy(xpath="//div[@id='content']//descendant::button[6]//following-sibling::button[2]")
private WebElement macbookComprisionIcon;
@FindBy(xpath="//div[@id='content']//descendant::button[9]//following-sibling::button[2]")
private WebElement macbookAirComprisionIcon;
@FindBy(xpath="//body//div[@class='alert alert-success alert-dismissible']")
private WebElement successMessageForMacbookComprision;
@FindBy(xpath="//a[text()='Product Compare (2)']")
private WebElement productComprisionLink;
@FindBy(xpath="//h1[text()='Product Comparison']")
private WebElement ProductComparisonChart;

//xpaths3====================================================>
@FindBy(xpath="//div[@class='button-group']//following::button[15]")
private WebElement wishListForSonyVaIO;
@FindBy(xpath="//body//div[@class='alert alert-success alert-dismissible']")
private WebElement MessageforSonyVaIo;

//xpaths4
@FindBy(xpath="//a[text()='MacBook Pro']")
private WebElement MacbookProItem;
@FindBy(xpath="//ul[@class='list-unstyled']//following::h2[2]")
private WebElement pricetagForMacbookPro;

public String getRetailWebSiteText(){
	 String getTextFromUI=retailWebsitetext.getText();
	 return getTextFromUI;
}
public void clickOnLaptopAndNotebookLink(){
	laptopandNotebookslink.click();
	
}
public void clickOnShowAllLaptopAndNotebook(){
	showAllLaptopandNotebooklink.click();
}
public void clickOnMacBookItemLink(){
	macBookItemLink.click();
}
public void clickOnAddtoCartMacbook(){
	addTOCartbttnForMacbook.click();
}
public String getSuccessMessageForMac(){
	String Text=successMMessageForMacbook.getText();
	return Text;
}
public void clickOn1ItemShowedIncart(){
	items602showedinCart.click();
}
public void clickOnVeiwCartButton(){
	viewCartBttn.click();
}
public void clickOnRemoveButton(){
	Removebutton.click();
	
}
public String cartShouldShowsZero(){
	String getTextFromUI=showsZero.getText();
		return getTextFromUI;
	}
// method2============================>
public void clickOnMacbookComprisionIcon(){
	macbookComprisionIcon.click();
	
}
public void clickOnMacbookAirComprisionIcon(){
	macbookAirComprisionIcon.click();
}
public String getSucessMessageForMacbookComprision(){
	String getTextFromUI=successMessageForMacbookComprision.getText();
	return getTextFromUI;

	
	
}
public void clickOnProductComprisionLink(){
	productComprisionLink.click();
}
public String getProductComparisonChartText(){
	String text=ProductComparisonChart.getText();
	return text;
}
public void clickOnWishListForSonyVaIO(){
	wishListForSonyVaIO.click();
	
}
public String getMessageForSonyVaIo(){
	String getTextFromUI=MessageforSonyVaIo.getText();
	return getTextFromUI;
}
//methods==================>s4

public void clickOnMacbookProItem(){
	MacbookProItem.click();
}
public String getTextForPriceTag(){
	 String text=pricetagForMacbookPro.getText();
	 return text;
}
}


