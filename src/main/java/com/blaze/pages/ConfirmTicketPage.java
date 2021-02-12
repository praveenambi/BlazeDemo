package com.blaze.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blaze.base.BasePage;

public class ConfirmTicketPage extends BasePage {

	public Properties props;
	public BasePage basepage= new BasePage();


	public ConfirmTicketPage() {

		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath  =  "//td[text()='Id']//following::td[1]")
	private WebElement TicketID;

	public String verifyTicketID() {

		return TicketID.getText();


	}





}
