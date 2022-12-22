package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16001_VerifyMetaDetailsandSitemapImplementation extends RelistorProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16001_VerifyMetaDetailsandSitemapImplementation";
		testDescription ="CR_RT_SM_001_Verify the Sitemap implementation of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16001"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyMetaDetailsandSitemapImplementation (String HomePageTitle,String MetaDescriptionValue,String MetaRobotsValue,String MetaGoogleSiteVerificationValue) {
		
		new RelistorHomePage()
		.VerifySitemapAndMetaDetails( HomePageTitle, MetaDescriptionValue, MetaRobotsValue, MetaGoogleSiteVerificationValue);
		
}
}
