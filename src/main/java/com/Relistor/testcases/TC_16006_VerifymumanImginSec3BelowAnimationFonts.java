package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16006_VerifymumanImginSec3BelowAnimationFonts extends RelistorProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16006_VerifymumanImginSec1BelowAnimationFonts";
		testDescription ="CR_RT_HP_003_Verify the changes made in section 3 of the Home page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16006"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifymumanImginSec3BelowAnimationFonts(String MumanimginSec1src,String MumanimginSec1alt,String MumanimginSec1align) {
		
		new RelistorHomePage()
		.VerifyMumanImgInBelowOfAnimation( MumanimginSec1src, MumanimginSec1alt, MumanimginSec1align);

}
}
