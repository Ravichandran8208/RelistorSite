package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16007_VerifyMummanImgAboveCloudText extends RelistorProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16007_VerifyMummanImgAboveCloudText";
		testDescription ="CR_RT_HP_004_Verify the changes made in section 8 of the Home page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16007"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMummanImgAboveCloudText (String MumanimginSec1src,String MumanimginSec1alt,String MumanimginSec1align) {
		
		new RelistorHomePage()
		.VerifyMumanImgInAboveCloudText( MumanimginSec1src, MumanimginSec1alt, MumanimginSec1align);
}
}
