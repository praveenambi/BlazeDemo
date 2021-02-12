package com.blaze.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blaze.base.BasePage;
import com.gargoylesoftware.htmlunit.Page;

public class UserDetailsPage extends BasePage{


	public Properties props;
	public BasePage basepage= new BasePage();


	public UserDetailsPage() {

		PageFactory.initElements(driver, this);
	}


	@FindBy(id =  "inputName")
	private WebElement inputName;

	@FindBy(id =  "address")
	private WebElement adress;

	@FindBy(id =  "city")
	private WebElement city;

	@FindBy(id =  "state")
	private WebElement state;

	@FindBy(id =  "zipCode")
	private WebElement zipCode;

	@FindBy(id =  "cardType")
	private WebElement cardType;

	@FindBy(id =  "creditCardNumber")
	private WebElement creditCardNumber;

	@FindBy(id =  "creditCardMonth")
	private WebElement creditCardMonth;

	@FindBy(id =  "creditCardYear")
	private WebElement creditCardYear;

	@FindBy(id =  "nameOnCard")
	private WebElement nameOnCard;

	@FindBy(xpath =  "//input[@value='Purchase Flight']")
	private WebElement purchaseFilghtButton;


	public ConfirmTicketPage enterUserDetails() throws InterruptedException {
		
		inputName.sendKeys(props.getProperty("Name"));
		adress.sendKeys(props.getProperty("Adress"));
		city.sendKeys(props.getProperty("City"));
		state.sendKeys(props.getProperty("State"));
		zipCode.sendKeys(props.getProperty("Zip"));
		cardType.sendKeys(props.getProperty("cardType"));
		creditCardNumber.sendKeys(props.getProperty("cardNumber"));
		creditCardMonth.sendKeys(props.getProperty("month"));
		creditCardYear.sendKeys(props.getProperty("year"));
		nameOnCard.sendKeys(props.getProperty("Cardname"));
		purchaseFilghtButton.click();





		return new ConfirmTicketPage();





	}













}
