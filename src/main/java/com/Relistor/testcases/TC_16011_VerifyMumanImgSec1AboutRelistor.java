package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16011_VerifyMumanImgSec1AboutRelistor extends RelistorProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16011_VerifyMumanImgSec1AboutRelistor";
		testDescription ="CR_RT_AR_001_Verify the changes made in section 1 of the About Relistor page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16011"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMumanImgSec1AboutRelistor (String MumanImgSec1src,String MumanImgSec1alt,String MumanImgSec1align) {
		
		new RelistorHomePage()
		.VerifyMumanImgSec1InAboutRelistor( MumanImgSec1src, MumanImgSec1alt, MumanImgSec1align);
}
}
	
