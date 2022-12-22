package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16016_VerifyMumanImgSec1NearSlideBarInResources extends RelistorProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16016_VerifyMumanImgSec1NearSlideBarInResources";
		testDescription ="CR_RT_RS_001_Verify the changes made in section 1 of the Resources  page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16016"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMumanImgSec1NearSlideBarInResources (String MumanImgNearSlideBaralign,String MumanImg2NearSlideBaralign) {
		
		new RelistorHomePage()
		.VerifyMumanImgSec1NearSlideBarInResources( MumanImgNearSlideBaralign, MumanImg2NearSlideBaralign);
}
}
