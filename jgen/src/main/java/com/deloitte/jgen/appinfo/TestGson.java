package com.deloitte.jgen.appinfo;

import com.google.gson.Gson;

public class TestGson {

	public static void main(String[] args) {
		Gson gson = new Gson();

		AppHeader appHeader = new AppHeader();
		appHeader.name = "HelloWorld";
		appHeader.type = "Standalone";

		AppDetails appDetails = new AppDetails();
		appHeader.appDetails = appDetails;

		// Write code to objects with App details

		String jsonInString = gson.toJson(appHeader);
		System.out.println(jsonInString);
		appHeader = gson.fromJson(jsonInString, AppHeader.class);

	}

}
