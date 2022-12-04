package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class RegisterPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By firstName = By.id("input-firstname");
	private By lastName = By.cssSelector("input#input-lastname");
	private By email = By.id("input-email");
	private By phone = By.cssSelector("input#input-telephone");
	private By pwd = By.id("input-password");
	private By pwdConfirm = By.id("input-confirm");	
	

	private By continuebtBtn = By.xpath("//input[@value='Continue' and @type='submit']");	
	private By agreementChkBox = By.xpath("//input[@name='agree']");	
	private By subscribeYes = By.xpath("//label[@class='radio-inline']/input[@type='radio' and @value='1']");
	private By subscribeNo = By.xpath("//label[@class='radio-inline']/input[@type='radio' and @value='0']");
	
	private By registerSuccessMsg = By.cssSelector("div#content h1");	
	private By logOutLink = By.linkText("Logout");
	private By registerLink = By.linkText("Register");
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	/**
	 * user registration
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param telephone
	 * @param password
	 * @param subscribe
	 */
	
	public String userRegister(String firstName, String lastName,
			String email, String telephone,String password, String subscribe) {
		
		eleUtil.doSendKeysWithVisibleElement(this.firstName, AppConstants.DEFAULT_LARGE_TIME_OUT, firstName);
		eleUtil.doSendKeys(this.lastName, lastName);
		eleUtil.doSendKeys(this.email, email);
		eleUtil.doSendKeys(phone, telephone);
		eleUtil.doSendKeys(pwd, password);
		eleUtil.doSendKeys(pwdConfirm, password);
			
			if(subscribe.equalsIgnoreCase("yes")) {
				eleUtil.doClick(subscribeYes);
			}else {
				eleUtil.doClick(subscribeNo);
			}
			
		eleUtil.doClick(this.agreementChkBox);
		eleUtil.doClick(this.continuebtBtn);
		
		String succMesg = eleUtil.waitForElementVisible(registerSuccessMsg, AppConstants.DEFAULT_LARGE_TIME_OUT).getText();
		System.out.println("Success Message ==> " + succMesg);
		
		eleUtil.doClickWithWait(logOutLink,AppConstants.DEFAULT_TIME_OUT);
		eleUtil.doClick(registerLink);
		
		return succMesg;
	}
	
	
	
	
	
}
