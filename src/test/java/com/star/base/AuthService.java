package com.star.base;

import com.star.models.requests.LoginRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService{

	private static final String BASE_PATH = "/auth/";
	
	public Response login(LoginRequest payload) {
		return postRequest(payload,BASE_PATH+"login");
	}
}
