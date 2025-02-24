package com.star.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.star.base.AuthService;
import com.star.models.requests.LoginRequest;
import com.star.models.responses.LoginResponse;

import io.restassured.response.Response;

public class LoginTest {

	@Test(description = "Login Test", groups = {"hello"})
	public void loginTest() {
		LoginRequest loginRequest = new LoginRequest("mor_2314", "83r5^_");
		AuthService auth = new AuthService();
		Response response = auth.login(loginRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
	}
}
