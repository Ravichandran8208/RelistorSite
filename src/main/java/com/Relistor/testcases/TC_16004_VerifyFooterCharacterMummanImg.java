package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16004_VerifyFooterCharacterMummanImg extends RelistorProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16004_VerifyFooterCharacterMummanImg";
		testDescription ="CR_RT_GF_001_Verify the changes made in the Global Footer section of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16004"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyFooterCharacterMummanImg (String MuumanImgFooterAlign,String MuumanImgFooteralt,String MuumanImgFootersrc) {
		
		new RelistorHomePage()
		.VerifyChangesGlobalFooterSection( MuumanImgFooterAlign, MuumanImgFooteralt, MuumanImgFootersrc);
}
}
