package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16003_VerifyFontpropInGlobalHeaderContents extends RelistorProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16003_VerifyFontpropInGlobalHeaderContents";
		testDescription ="CR_RT_GH_003_Verify the font properties of the Bar content and CTA button present in the Global Header section of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16003"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyFontpropInGlobalHeaderContents (String AnswertheQuestionContentFontFam,String AnswertheQuestionContentClr,String AnswertheQuestionContentSize,String AnswertheQuestionContentWeight,String AnswertheQuestionContentHeight,String AnswertheQuestionContentBckgroundbarClr,String CTAFontFam,String CTAClr,String CTASize,String CTAWeight,String CTAHeight,String CTABckgroundbarClr,String CTABLocation) {
		
		new RelistorHomePage()
		.VerifyPropAnstheQuestextHeaderSection( AnswertheQuestionContentFontFam, AnswertheQuestionContentClr, AnswertheQuestionContentSize, AnswertheQuestionContentWeight, AnswertheQuestionContentHeight, AnswertheQuestionContentBckgroundbarClr)
		.VerifyPropCTAHeaderSection( CTAFontFam, CTAClr, CTASize, CTAWeight, CTAHeight, CTABckgroundbarClr, CTABLocation);
}
}