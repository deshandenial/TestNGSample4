package com.qa.letcode.utils;

import java.util.ArrayList;
import java.util.List;

public class Constants 
{
	public static final String LOGIN_PAGE_TITLE = "LetCode with Koushik";
	
	public static final String ACC_PAGE_TITLE = "LetCode - Testing Hub";
	public static final int ACC_PAGE_SECTIONS_COUNT = 5;
	
	public static final int PRODUCT_IMAGES_COUNT_MACBOOK = 4;
	public static final String ACCOUNT_CREATION_SUCCESS_MESSG = "Your Account Has Been Created!";

	/********************SheetNames**********************/
	public static final String REGISTER_SHEET_NAME = "register";

	
	
	public static List<String> expectedAccSecList() {
		List<String> expEcList = new ArrayList<String>();
		expEcList.add("My Account");
		expEcList.add("My Orders");
		expEcList.add("My Affiliate Account");
		expEcList.add("Newsletter");
		System.out.println(expEcList);
		return expEcList;
	}

}
