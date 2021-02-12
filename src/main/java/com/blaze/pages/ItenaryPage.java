package com.blaze.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blaze.base.BasePage;

public class ItenaryPage extends BasePage {

	@FindBy(xpath = "//td[text()='Lufthansa']/preceding::input[1]")
	private WebElement bookflightButoon;


	public ItenaryPage() {

		PageFactory.initElements(driver, this);
	}


	public String verifyTitle() {

		System.out.println(driver.getTitle());

		return driver.getTitle();

	}


	public UserDetailsPage bookItenary() {

		bookflightButoon.click();


		return new UserDetailsPage();




	}



}
