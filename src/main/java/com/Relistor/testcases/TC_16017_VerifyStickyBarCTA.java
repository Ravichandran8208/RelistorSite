package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16017_VerifyStickyBarCTA extends RelistorProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16017_VerifyStickyBarCTA";
		testDescription ="CR_RT_DG_001_Verify the changes made in End Quiz section on Interactive Discussion Guide page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16017"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMumanImgSec1NearSlideBarInResources (String Title) {
		
		new RelistorHomePage()
		.VerifyCTACheckyourGut(Title);

}
}
