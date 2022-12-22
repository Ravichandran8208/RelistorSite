package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16008_VerifyMumanImgInAboutOICSec1 extends RelistorProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16008_VerifyMumanImgInAboutOICSec1";
		testDescription ="CR_RT_AO_001_Verify the changes made in section 1  of the About OIC page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16008"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMumanImgInAboutOICSec1 (String MumanimginAboutOICSec1src,String MumanimginAboutOICSec11alt,String MumanimginAboutOICSec1align) {
		
		new RelistorHomePage()
		.VerifyMumanImgInAboutOIC( MumanimginAboutOICSec1src, MumanimginAboutOICSec11alt, MumanimginAboutOICSec1align);
}
}
