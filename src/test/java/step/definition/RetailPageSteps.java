package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;import page.objects.RetailPageObj;

public class RetailPageSteps extends Base {
	RetailPageObj retailpageobj=new RetailPageObj();
	
	
		@Given("User is on Retail website")
		public void user_is_on_retail_website() {
			String expectedText="TEST ENVIRONMENT";
			String actualText=retailpageobj.getRetailPageText();
			Assert.assertEquals(expectedText, actualText);
			logger.info("Retail website was varified successfully");
		}

		@Given("User click on MyAccount")
		public void user_click_on_my_account() {
			retailpageobj.clickOnMyAccountButton();
			logger.info("My Account button was clicked successfully");
		}
		

		@When("User click on Login")
		public void user_click_on_login() {
			retailpageobj.clickOnLoginLink();
			logger.info("the Login link was clicked successfully");
		}

		@When("User enter username ‘userName’ and password 'password’")
		public void user_enter_username_user_name_and_password_password() {
			retailpageobj.enterEmail("ahmadi11@gmail.com");
			retailpageobj.enterPassword("123456");
			logger.info("the username and password was entered successfully");
		   
		}

		@When("User click on Login button")
		public void user_click_on_login_button() {
			retailpageobj.clickOnLoginButton();
			logger.info("the Login button was clicked successfully");
		   
		}

		@Then("User should be logged in to MyAccount dashboard")
		public void user_should_be_logged_in_to_my_account_dashboard() {
			String expectedText="My Account";
			 String actualText=retailpageobj.getTextAfterLogin();
			 Assert.assertEquals(expectedText, actualText);
			 logger.info("The dashbord for My Account was varified successfully");
		   
		}
		//Scenario1 Steps
		@When("User click on ‘Register for an Affiliate Account’ link")
		public void user_click_on_register_for_an_affiliate_account_link() {
			retailpageobj.clickOnRegisterForAnAffiliateAcct();
			logger.info("the affiliate Registerion  was clicked successfully");
		   
		}

		@When("User fill affiliate form with below information")
		public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
			List<Map<String,String>> data=dataTable.asMaps(String.class, String.class);
			retailpageobj.enterCompanyName(data.get(0).get("company"));
			retailpageobj.enterWebsiteName(data.get(0).get("website"));
			retailpageobj.enterTaxId(data.get(0).get("taxID"));
			retailpageobj.enterchequePayeeName(data.get(0).get("ChequePayeeName"));
			logger.info("the affiliate form was filled successfully");
		 
			
		}

		@When("User check on About us check box")
		public void user_check_on_about_us_check_box() {
			retailpageobj.clickOnAboutUsCheckBox();
			logger.info("About check boc was clicked successfuly");
		}

		@When("User click on Continue button")
		public void user_click_on_continue_button() {
			retailpageobj.clickOnContinueButton();
			logger.info("the continue button was clicked successfully");
		    
		}

		@Then("User should see a success message")
		public void user_should_see_a_success_message() {
	 String expectedText="Success: Your account has been successfully updated.";
	 String actualText=retailpageobj.getSucessMessage();
			 Assert.assertEquals(expectedText, actualText);
	 logger.info("The success message was varified successfully");
			
		   
		}
		//part2
		@When("User click on ‘Edit your affiliate informationlink")
		public void user_click_on_edit_your_affiliate_informationlink() {
		    retailpageobj.EdityourAffiliateAccountLink();
		    logger.info("The affiliate information link was clicked sucessfully");
		}

		@When("user click on Bank Transfer radio button")
		public void user_click_on_bank_transfer_radio_button() {
			retailpageobj.clickOnbankTransferRadioButtn();
			logger.info("The Bank Transfer radio button was clicked successfully");
		    		}

		@When("User fill Bank information with below information")
		public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		    List<Map<String,String>>data=dataTable.asMaps(String.class,String.class);
		    retailpageobj.enterBankName(data.get(0).get("bankName"));
		    retailpageobj.enterBankBranchNumber(data.get(0).get("abaNumber"));
		    retailpageobj.enterSwiftCode(data.get(0).get("swiftCode"));
		    retailpageobj.enterAccountName(data.get(0).get("accountName"));
		    retailpageobj.enterAccountNumber(data.get(0).get("accountNumber"));
		    logger.info("The bank information was fillded successfuuly");
		    
		    
		}
		//part3
		@When("User click on ‘Edit your account information’ link")
		public void user_click_on_edit_your_account_information_link() {
		    retailpageobj.clickOnEditAccountInformationLink();
		    logger.info("The Account information link was clicked Successfuuly");
		}

		@When("User modify below information")
		public void user_modify_below_information(DataTable dataTable){
		    List<Map<String,String>> data=dataTable.asMaps(String.class,String.class);
		    retailpageobj.enterYourName(data.get(0).get("firstname"));
		    retailpageobj.enterYourLastname(data.get(0).get("lastName"));
		    retailpageobj.enterYourEmail(data.get(0).get("email"));
		    retailpageobj.enterYourTelephone(data.get(0).get("telephone"));
		    logger.info("The information was filling out SuccessFully");
		    
		}

		@Then("User click on continue button")
		public void User_click_on_continue_button(){
			retailpageobj.clickOnContinueButtonForAccount();
			logger.info("The contine button for edit Account information was clicked sucessfully");
			
		}
		

		@Then("User should see a message ‘Success: Your account has been successfully updated.’")
		public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
	String  actualText=retailpageobj.getSuccesMessageForAccount();
	String expectedText=("Success: Your account has been successfully updated.");
	Assert.assertEquals(expectedText,actualText);
	logger.info("Success Message for EdIT aCCOUNT WAS verifed sucessfully");
		}
		

		}

		
	
	


