package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16010_VerifyMumanImgSec4InAboutOIC extends RelistorProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16010_VerifyMumanImgSec4InAboutOIC";
		testDescription ="CR_RT_AO_002_Verify the changes made in section 4 of the About OIC page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16010"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMumanImgSec4InAboutOIC (String MumanImgSec4RightSidesrc,String MumanImgSec4RightSidealt,String MumanImgSec4RightSidealign) {
		
		new RelistorHomePage()
		.VerifyMumanImgSec4RightSideInAboutOIC( MumanImgSec4RightSidesrc, MumanImgSec4RightSidealt, MumanImgSec4RightSidealign);
}
}