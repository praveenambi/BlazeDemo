package com.blaze.APITests;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.blaze.base.BasePage;
import com.blaze.pojo.WeatherDetails;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;

public class WeatherTest {
	
	/*
	 * 
	 * 
	 * This is a Test class to verify the Weather details of the given City
	 */
	
	
	public Properties props;
	public BasePage basepage= new BasePage();
	
	
	
  @Test
  public void getwetherDetails() {
		RestAssured.baseURI= basepage.props.getProperty("BaseURI");
		WeatherDetails response = given().header("Content-Type","application/json").expect().defaultParser(Parser.JSON)
				.queryParam("q", basepage.props.getProperty("city"))
				.queryParam("appid", props.getProperty("key"))
				.when().get("data/2.5/weather")
				.then().log().all().assertThat().statusCode(200).header("Content-Encoding", "UTF-8").extract().response().as(WeatherDetails.class);

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);

		System.out.println("The City  is " +response.getName());

		System.out.println("The City temperature  is " + response.getMain().getTemp());

		System.out.println("The City Humidity is " +response.getMain().getHumidity());
		
		Assert.assertEquals(props.getProperty("ExpectedCity"), response.getName());
		Assert.assertEquals(props.getProperty("ExpectedTemp"), response.getMain().getTemp());
		Assert.assertEquals(props.getProperty("ExpectedHumid"), response.getMain().getHumidity());

  }
}
