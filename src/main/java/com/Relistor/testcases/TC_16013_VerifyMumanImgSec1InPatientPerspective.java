package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16013_VerifyMumanImgSec1InPatientPerspective extends RelistorProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16013_VerifyMumanImgSec1InPatientPerspective";
		testDescription ="CR_RT_PP_001_Verify the changes made in section 1 of the Patient Perspective  page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16013"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMumanImgSec1InPatientPerspective (String MumanImg1Sec1src,String MumanImg1Sec1alt,String MumanImg1Sec1align) {
		
		new RelistorHomePage()
		.VerifyMumanImgSec1InPatientPerspective(MumanImg1Sec1src, MumanImg1Sec1alt, MumanImg1Sec1align);
}
}