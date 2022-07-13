package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;

import page.objects.LaptopAndNotebookpaageobj;

public class LaptopAndNoteBookSteps extends Base {
	
	LaptopAndNotebookpaageobj laptopAndnotebook=new LaptopAndNotebookpaageobj();

	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopAndnotebook.clickOnLaptopAndNotebookLink();
		logger.info("The Laptop&NoteBook was clicked successfully");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopAndnotebook.clickOnShowAllLaptopAndNotebook();
		logger.info("Show all laptop&Notebook was clicked successfully");
	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopAndnotebook.clickOnMacBookItemLink();
		logger.info("Macbook item was clicked successfully");
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		String expectedText="Success: You have added MacBook to your shopping cart!";
		 String actualText= laptopAndnotebook.getSuccessMessageForMac().substring(0,54 );
		 Assert.assertEquals(expectedText, actualText);
		 logger.info("Success Message for macbook verified Successfully");
	}

	@Then("User should see {int} tem\\(s){double} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
	   laptopAndnotebook.clickOn1ItemShowedIncart();
	   logger.info("The  1 tem(s)-602.00 showed to the cart ");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopAndnotebook.clickOnVeiwCartButton();
		logger.info("the user clicked the cart option successfully");
		
	   
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopAndnotebook.clickOnRemoveButton();
		logger.info("The user saw the  red X button to remove the item from cart successfully");
	}

	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		String actualText=laptopAndnotebook.cartShouldShowsZero();
		String expectedText="0 item(s) - $0.00";
		Assert.assertEquals(actualText,expectedText);
		logger.info("the item after removing showed zero successfully");
	}
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	   laptopAndnotebook.clickOnMacbookComprisionIcon();
	   logger.info("The comprision Icon on macBook was clicked successfully");
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	    laptopAndnotebook.clickOnMacbookAirComprisionIcon();
	    logger.info("the comprision Icon for macBookAir was cliked successfully");
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
	    String actualText=laptopAndnotebook.getSucessMessageForMacbookComprision().substring(0, 59);
	    System.err.println(actualText);
	    String expectedText="Success: You have added MacBook to your product comparison!";
	    Assert.assertEquals(expectedText, actualText);
	    logger.info("the macBook Air message was verifyied successfully");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopAndnotebook.clickOnProductComprisionLink();
		logger.info("The product comprison link was clicked successfulyy");
	    
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	   String actualText= laptopAndnotebook.getProductComparisonChartText();
	   String expectedText="Product Comparison";
	   Assert.assertEquals(expectedText,actualText);
	    logger.info("The product comprrison chart was verified successfully");
	}
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	    laptopAndnotebook.clickOnWishListForSonyVaIO();
	    logger.info("The Sony VaIO wish List was clicked successfully");
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		String actualText=laptopAndnotebook.getMessageForSonyVaIo().substring(0,61 );
		System.err.println(actualText);
		String expectedText="Success: You have added Sony VAIO to your product comparison!";
		Assert.assertEquals(expectedText, actualText);
		logger.info("The Message For  Sony VAIO to your wish list was verifed successfuuly");
		
	    	}
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
	   laptopAndnotebook.clickOnMacbookProItem();
	   logger.info("The MacBook PrO Item was clicked successfully");
	}

	@Then("User should see ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
	  String actualText= laptopAndnotebook.getTextForPriceTag();
	  String expectedText="$2,000.00";
	  Assert.assertEquals(expectedText,actualText);
	  logger.info("The price tag 2,000.00 was verified on UI successfullly");
	}
}

