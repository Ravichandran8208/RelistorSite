package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16015_VerifyMumanImgSec1InResources extends RelistorProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16015_VerifyMumanImgSec1InResources";
		testDescription ="CR_RT_RS_001_Verify the changes made in section 1 of the Resources  page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16015"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMumanImgSec1InResources (String MumanImg1Sec1src,String MumanImg1Sec1alt,String MumanImg1Sec1align) {
		
		new RelistorHomePage()
		.VerifyMumanImgSec1InResources( MumanImg1Sec1src, MumanImg1Sec1alt, MumanImg1Sec1align);
}
}
