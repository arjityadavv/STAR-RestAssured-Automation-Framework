package com.star.base;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	private RequestSpecification requestSpecification;
	protected String baseURI = "https://fakestoreapi.com";
	
	public BaseService() {
		requestSpecification = RestAssured.given().baseUri(baseURI);
	}
	
	public Response postRequest(String payload, String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);
	}
}
