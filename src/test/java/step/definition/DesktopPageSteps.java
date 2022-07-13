package step.definition;



import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import page.objects.DesktobspageObj;

public class DesktopPageSteps extends Base {
	
	DesktobspageObj desktoppageobj=new DesktobspageObj();
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktoppageobj.clickOnDesktopLink();
		logger.info("the Desktob Tab was clicked successfully");
	    	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktoppageobj.clickOnshowAllDesktopLink();
		logger.info("The Show All Desktops was clicked successfully");
	    
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		String expectedText="Desktops";
	String actualText	=desktoppageobj.getTextAfterLoginToShowAll();
	Assert.assertEquals(expectedText, actualText);
	    logger.info("User was able to see all items are present in Desktop page successfully");
	}
	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktoppageobj.clickOnAddToCartButton();
		logger.info("User was able to click on hp button sucessfully");
	  	}

	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktoppageobj.enterQuantityNumbers("2");
		logger.info("User was able to select a quantity sucessfully");
	    	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	   desktoppageobj.clickOnAddtoCartButton2();
	   logger.info("User was able to click on cart button for second time sucessfully");
	}

@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
	    String actualText=desktoppageobj.getSuccessMessageFordesktop().substring(0, 56); 
	    String expectedText="Success: You have added HP LP3065 to your shopping cart!";
	    Assert.assertEquals(expectedText, actualText);
	    logger.info("The Success Message was seen successfully");
	}
@When("User click ADD TO CART option on Canon EOS 5D item")
public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
	desktoppageobj.clickOnAddToCartCanon();
	logger.info("The Canon EOS was clicked successfully");
    
}

@When("User select color from dropdown Red")
public void user_select_color_from_dropdown_red() {
	desktoppageobj.selectRedFromDD("Red");
	logger.info("The red color from dropdown was clicked sucessfully");
	

}

@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	String expectedText="Success: You have added Canon EOS 5D Camera to your shopping cart!";
	String actualText= desktoppageobj.getSucessMessageCanon().substring(0,66 );;
	Assert.assertEquals(expectedText,actualText);
	logger.info("The success message for Canon EOS was verfided successfully");
    }
@When("User click on Canon EOS 5D item")
public void user_click_on_canon_eos_5d_item() {
    desktoppageobj.clickOnAddToCartCanon();
    logger.info("The canon EOS clicked Sucessfully");
}

@When("User click on write a review link")
public void user_click_on_write_a_review_link() {
    desktoppageobj.clickOnReviewLink();
    logger.info("the Review link was clicked successfully");
}
@When("user fill the review information with below information")
public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
	List<Map<String,String>> data=dataTable.asMaps(String.class,String.class);
	desktoppageobj.enterYourNameOnReview(data.get(0).get("yourname"));
	desktoppageobj.enterYourReview(data.get(0).get("yourReview"));
	desktoppageobj.clickOnRatingChechBox(data.get(0).get("Rating"));
	logger.info("The review form was submitted successfully");
	
	
	
	
   
}



@When("User click on Continue Button")
public void user_click_on_continue_button() {
    desktoppageobj.clickOnContinueBttnForReview();
    logger.info("The Continue button for Review was clicked successfully");
}

@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
	String expectedText="Thank you for your review. It has been submitted to the webmaster for approval.";
	String actualText= desktoppageobj.getSuccessMessageForReview();
	Assert.assertEquals(expectedText, actualText);
	logger.info("The message for Review was verifyied succcessfully");
}

	}

