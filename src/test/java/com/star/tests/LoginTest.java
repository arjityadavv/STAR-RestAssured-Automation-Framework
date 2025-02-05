package com.star.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.star.base.AuthService;

import io.restassured.response.Response;

public class LoginTest {

	@Test(description = "Login Test")
	public void loginTest() {
		AuthService auth = new AuthService();
		Response response = auth.login("{\"username\": \"mor_2314\",\"password\": \"83r5^_\"}");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
