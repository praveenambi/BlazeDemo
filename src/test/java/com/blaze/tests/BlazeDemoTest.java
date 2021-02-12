package com.blaze.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.blaze.base.BasePage;
import com.blaze.pages.BlazeDemoHomePage;
import com.blaze.pages.ConfirmTicketPage;
import com.blaze.pages.ItenaryPage;
import com.blaze.pages.UserDetailsPage;

public class BlazeDemoTest extends BasePage{

	public BlazeDemoHomePage blazedemo ;
	public ItenaryPage itenery;
	public UserDetailsPage userdetails;
	public ConfirmTicketPage confirmTicket;

	public  BlazeDemoTest() {

		super();
	}


	@BeforeMethod
	public void setup() {
		init_driver();
		blazedemo = new BlazeDemoHomePage();

	}


	@Test
	private void searchFlightTest() {
		try {
			String pagetitle =blazedemo.validateHomePageTitle();
			itenery = blazedemo.serachItenary();
			Assert.assertEquals(pagetitle, " BlazeDemo");


		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Test
	private void enterUserDetails() {
		try {
			userdetails = new UserDetailsPage();
			confirmTicket = userdetails.enterUserDetails();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Test
	private void selectItenary() {
		try {
			userdetails = itenery.bookItenary();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Test
	private void verifyTicketDi() {
		try {
			confirmTicket = new ConfirmTicketPage();
			String ticketid =confirmTicket.verifyTicketID();
			System.out.println("The confirmed ticket id is " +  ticketid);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod 
	private void teardown() {
		closeAllbrowser();

	}





}
