package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16002_VerifyGlobalHeaderContentAndCTAFunctionality extends RelistorProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16002_VerifyGlobalHeaderContentAndCTAFunctionality";
		testDescription ="CR_RT_GH_002_Verify the functionality of the CTA button present in Global Header section of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16002"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyGlobalHeaderContentAndCTAFunctionality (String BelowBannerContentText,String AnswertheQuestionContentText,String AnswertheQuestionContentAlignment,String CTATextText,String CTATextBtnTitle) {
		
		new RelistorHomePage()
		.VerifyGlobalHeaderSection( BelowBannerContentText, AnswertheQuestionContentText, AnswertheQuestionContentAlignment, CTATextText, CTATextBtnTitle);
}
}
