package com.star.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.star.base.AuthService;
import com.star.models.requests.LoginRequest;

import io.restassured.response.Response;

public class LoginTest2 {

	@Test(description = "Login Test2", groups = {"hello"})
	public void loginTest() {
		LoginRequest loginRequest = new LoginRequest("mor_2314", "83r5^_");
		AuthService auth = new AuthService();
		Response response = auth.login(loginRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
