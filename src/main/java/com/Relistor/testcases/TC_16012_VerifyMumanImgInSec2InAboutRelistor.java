package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16012_VerifyMumanImgInSec2InAboutRelistor extends RelistorProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16012_VerifyMumanImgInSec2InAboutRelistor";
		testDescription ="CR_RT_AR_002_Verify the changes made in section 2  of the About Relistor page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16012"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMumanImgInSec2InAboutRelistor (String MumanImgSec2src,String MumanImgSec2alt,String MumanImgSec21align) {
		
		new RelistorHomePage()
		.VerifyMumanImgSec2InAboutRelistor( MumanImgSec2src, MumanImgSec2alt, MumanImgSec21align);
}
}
