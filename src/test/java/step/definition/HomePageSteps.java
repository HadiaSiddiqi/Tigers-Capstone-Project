package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;

import page.objects.HomePagepageObj;

public class HomePageSteps  extends Base{
	HomePagepageObj homepagesteps=new HomePagepageObj();
	@When("User click on Currency")
	public void user_click_on_currency() {
	   homepagesteps.clickOnCurrencyButton();
	   logger.info("The currency was clicked successfully");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepagesteps.selectEurofromDD();
		logger.info("Euro was choosed successfully");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homepagesteps.getTheTextAfterChangingToEuro();
		logger.info(" currency value was changrd to Euro successfully");
	    	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	    homepagesteps.clickOnShoppingCart();
	    logger.info("The shopping cart was clicked successfully");
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
	 String actualText =  homepagesteps.getMessageForEmptyCart();
	 System.err.println(actualText);
	 String expectedText="Your shopping cart is empty!";
	 Assert.assertEquals(expectedText, actualText);
	 logger.info("The shopping cart message was verified successfully");
	 
	}
}
