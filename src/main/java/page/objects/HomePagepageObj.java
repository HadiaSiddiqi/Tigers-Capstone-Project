package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePagepageObj extends Base {
	
	public HomePagepageObj(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
	private WebElement retailWebsitetext;
	@FindBy(xpath="//span[text()='Currency']")
	private WebElement currencybutton;
	@FindBy(xpath="//button[text()='€ Euro']")
	private WebElement  euro;
	@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']//following::Strong")
	private WebElement changedtoEuro;
	
	//xpath========================>2
	@FindBy(xpath="//span[text()='Shopping Cart']")
	private WebElement shoppingCartButton;
	@FindBy(xpath="//div[@id='content']//p[text()='Your shopping cart is empty!']")
	private WebElement messageForemptyCart;
	
	public String getRetailWebSiteText(){
		 String getTextFromUI=retailWebsitetext.getText();
		 return getTextFromUI;
	}
	public void clickOnCurrencyButton(){
		currencybutton.click();
	}
	public void selectEurofromDD(){
		euro.click();
	}
	public String getTheTextAfterChangingToEuro(){
		String textFromUI=changedtoEuro.getText();
		return  textFromUI;
	}
	public void clickOnShoppingCart(){
		shoppingCartButton.click();
	}
	public String getMessageForEmptyCart(){
		String textFromUI=messageForemptyCart.getText();
		return textFromUI;
		
	}
}
