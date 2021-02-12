/**
 * 
 */
package com.blaze.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.blaze.base.BasePage;

/**
 * @author PRAAMBI
 *
 */
public class BlazeDemoHomePage extends BasePage {
	
	
	int timeout = 10;
	double temperature;

	public Properties props;
	public BasePage basepage= new BasePage();
	
	
	public BlazeDemoHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	/*******************************************************************************/
	
	
	@FindBy(xpath = "//select[@name='fromPort']")
	private WebElement departureCity;
	
	@FindBy(xpath = "//select[@name='toPort']")
	private WebElement destinationCity;
	
	@FindBy(xpath = "//input[@value='Find Flights']")
	private WebElement findFlightButton;
	
	
	
	
	
	public String validateHomePageTitle() {

		return driver.getTitle();

	}
	
	
	public ItenaryPage serachItenary() throws InterruptedException {
		selectDropdownVal(departureCity, props.getProperty("source"));
		selectDropdownVal(destinationCity, props.getProperty("destination"));
		findFlightButton.click();
		
		return new ItenaryPage();
	
	
	


}
	
	
	public void selectDropdownVal(WebElement element, String city) {
		
		Select sel = new Select(element);
		sel.selectByValue(city);
	}
		
	}
