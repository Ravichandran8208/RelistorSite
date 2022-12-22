package com.Relistor.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Relistor.pages.RelistorHomePage;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class TC_16005_VerifyBannerImgsInSec1 extends RelistorProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_16005_VerifyBannerImgsInSec1";
		testDescription ="CR_RT_HP_001_Verify the changes made in section 1 of the Home page of the Relistor DTC Website";
		authors="Ravichandran";
		category ="Regression";
		
		  excelFileName="TC_16005"; sheetName="Sheet1";
		 
	}

	@Test  (dataProvider = "fetchData") 
		public void runVerifyBannerImgsInSec1 (String BannerImg1src,String BannerImg1alt,String BannerImg2src,String BannerImg2alt ,String BannerImg3src,String BannerImg3alt,String BannerImg4src,String BannerImg4alt,String videoplayBtnalt ) {
		
		new RelistorHomePage()
		.VerifyChangesBannerImgInSec1( BannerImg1src, BannerImg1alt, BannerImg2src, BannerImg2alt , BannerImg3src, BannerImg3alt, BannerImg4src, BannerImg4alt,videoplayBtnalt );
}
}
