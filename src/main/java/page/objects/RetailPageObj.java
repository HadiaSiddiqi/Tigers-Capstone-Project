package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import junit.framework.Assert;

public class RetailPageObj extends Base {

	public RetailPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement RetailwebsiteText;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//ul//a[text()='Login']")
	private WebElement loginLink;
	@FindBy(id = "input-email")
	private WebElement emailAddressField;
	@FindBy(id = "input-password")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountPage;

	// Xpathpart2
	@FindBy(xpath = "//ul[@class='list-unstyled']//following-sibling::ul//li//a[text()='Register for an affiliate account']")
	private WebElement registerAffiliateLink;
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyField;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteField;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIdField;
	@FindBy(xpath = "//input[@type='radio' and @value='cheque']")
	private WebElement paymentMethodRadioButtn;
	@FindBy(id = "input-cheque")
	private WebElement cheqePayeeName;
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement AboutUsCheckbox;
	@FindBy(xpath = "//input[@type='submit' and @value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement successMessage;

	// xpath part3
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editaffiliateinformationlink;
	@FindBy(xpath = "//input[@name='payment' and @value='bank']")
	private WebElement bankTransferRadioButtn;
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankName;
	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement bankBranchNumber;
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement SWIFTcode;
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountName;
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumber;
	@FindBy(xpath = "//input[@type='submit' and @class='btn btn-primary']")
	private WebElement continueButton1;
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement message;

	// xpathpart4
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editAccountInformation;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstnameField;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastnameField;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;
	@FindBy(xpath = "//input[@type='submit' and @value='Continue']")
	private WebElement continueButtonforeditaccount;
	@FindBy(xpath = "//body//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageForAccountInfo;

	// Methods part1
	public String getRetailPageText() {
		String textFromUI = RetailwebsiteText.getText();
		return textFromUI;
	}

	public void clickOnMyAccountButton() {
		myAccountButton.click();
	}

	public void clickOnLoginLink() {
		loginLink.click();
	}

	public void enterEmail(String email) {
		emailAddressField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public String getTextAfterLogin() {
		String myAccountText = myAccountPage.getText();
		return myAccountText;
	}

	// Methods part2
	public void clickOnRegisterForAnAffiliateAcct() {
		registerAffiliateLink.click();

	}

	public void enterCompanyName(String companyname) {
		companyField.sendKeys("companyname");
	}

	public void enterWebsiteName(String websitename) {
		websiteField.sendKeys("websitename");
	}

	public void enterTaxId(String id) {
		taxIdField.sendKeys("id");

	}

	public void paymentMethodRadiobuttn() {
		boolean isselected = paymentMethodRadioButtn.isSelected();
	}

	public void enterchequePayeeName(String payeename) {
		cheqePayeeName.sendKeys("payeename");
	}

	public void clickOnAboutUsCheckBox() {
		AboutUsCheckbox.click();

	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public String getSucessMessage() {
		String text = successMessage.getText();
		return text;

	}

	// Methods Part3
	public void EdityourAffiliateAccountLink() {
		editaffiliateinformationlink.click();

	}

	public void clickOnbankTransferRadioButtn() {
		bankTransferRadioButtn.click();

	}

	public void enterBankName(String name) {
		bankName.sendKeys("kabul Bank");
	}

	public void enterBankBranchNumber(String number) {
		bankBranchNumber.sendKeys("123");
	}

	public void enterSwiftCode(String code) {
		SWIFTcode.sendKeys("2331");
	}

	public void enterAccountName(String account) {
		accountName.sendKeys("HadiasAccount");
	}

	public void enterAccountNumber(String accountNumber1) {
		accountNumber.sendKeys("1234");
	}

	public void clickOnContinueForEdit() {
		continueButton1.click();
	}

	public String getsuccesMessagetwo() {
		String text = message.getText();
		return text;

	}
	//MethodPart4
	public void clickOnEditAccountInformationLink(){
		editAccountInformation.click();
		
	}
	public void enterYourName(String name){
		firstnameField.sendKeys("name");
		
	}
	public void enterYourLastname(String lastname){
		lastnameField.sendKeys("lastname");
	}
	public void enterYourEmail(String email){
		emailField.sendKeys("email");
		
	}
	public void enterYourTelephone(String phonenumbers){
		telephoneField.sendKeys("2244466677");
	}
	public void clickOnContinueButtonForAccount(){
		continueButtonforeditaccount.click();
	}
	public String getSuccesMessageForAccount(){
		String text=successMessageForAccountInfo.getText();
		return text;
		
	}
}
