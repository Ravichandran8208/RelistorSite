package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16014_VerifyMumanImgSec1InFAQ extends RelistorProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16014_VerifyMumanImgSec1InFAQ";
		testDescription ="CR_RT_FAQs_001_Verify the changes made in section 1 of the FAQs  page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16014"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMumanImgSec1InFAQ (String MumanImg1Sec1src,String MumanImg1Sec1alt,String MumanImg1Sec1align) {
		
		new RelistorHomePage()
		.VerifyMumanImgSec1InFAQ( MumanImg1Sec1src, MumanImg1Sec1alt, MumanImg1Sec1align);
}
}
