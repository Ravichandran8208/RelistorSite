package com.Relistor.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.RelistorProjectSpecificMethods;

public class RelistorHomePage extends RelistorProjectSpecificMethods{
	public RelistorHomePage VerifySitemapAndMetaDetails(String HomePageTitle,String MetaDescriptionValue,String MetaRobotsValue,String MetaGoogleSiteVerificationValue) {
		verifyTitle(HomePageTitle);
		verifyAltTag();
		WebElement MetaDescription = locateElement(Locators.XPATH, "//meta[@content='RELISTOR® is a prescription drug used to treat opioid induced constipation in adults with long-lasting non-cancer pain. See Safety and full Prescribing Information.']");
		verifyExactAttribute(MetaDescription, "content", MetaDescriptionValue);
		WebElement MetaRobots = locateElement(Locators.XPATH, "//meta[@content='INDEX, FOLLOW']");
		verifyExactAttribute(MetaRobots, "content", MetaRobotsValue);
		WebElement MetaGoogleSiteVerification = locateElement(Locators.XPATH, "//meta[@content='nfKQE4g9nvReq9AgOxrtR1ZZHXiw7KvnKtMfdwza3AY']");
		verifyExactAttribute(MetaGoogleSiteVerification, "content", MetaGoogleSiteVerificationValue);
		verifyBrokenLink();
		
		return this;

	}
	public RelistorHomePage VerifyGlobalHeaderSection(String BelowBannerContentText,String AnswertheQuestionContentText,String AnswertheQuestionContentAlignment,String CTATextText,String CTATextBtnTitle) {
		WebElement BelowBannerContent = locateElement(Locators.XPATH, "//p[@class='d-block d-lg-none']/following-sibling::p[1]");
		verifyExactText(BelowBannerContent, BelowBannerContentText);
		WebElement AnswertheQuestionContent = locateElement(Locators.XPATH, "//div[@class='yellow-content']//p[1]");
		verifyExactText(AnswertheQuestionContent, AnswertheQuestionContentText);
		verifytextAlign(AnswertheQuestionContent, AnswertheQuestionContentAlignment);
		WebElement CTAText = locateElement(Locators.XPATH, "//a[@class='gut-button']");
		verifyExactText(CTAText, CTATextText);
		click(CTAText);
		switchToWindow("Relistor: Opioid-Induced Constipation Discussion Guide - NOT FOR COMMERCIAL USE");
		verifyTitle(CTATextBtnTitle);


		return this;

}
	public RelistorHomePage VerifyPropAnstheQuestextHeaderSection(String AnswertheQuestionContentFontFam,String AnswertheQuestionContentClr,String AnswertheQuestionContentSize,String AnswertheQuestionContentWeight,String AnswertheQuestionContentHeight,String AnswertheQuestionContentBckgroundbarClr) {
		WebElement AnswertheQuestionContent = locateElement(Locators.XPATH, "//p[text()='Answer these questions to help start a conversation with your healthcare provider today. ']");
		verifytextFamily(AnswertheQuestionContent, AnswertheQuestionContentFontFam);
		verifytextBackgroundColor(AnswertheQuestionContent, AnswertheQuestionContentClr);
		verifytextSize(AnswertheQuestionContent, AnswertheQuestionContentSize);
		verifytextWeight(AnswertheQuestionContent, AnswertheQuestionContentWeight);
		verifytextLineHeight(AnswertheQuestionContent, AnswertheQuestionContentHeight);
		verifyBackgroundColor(AnswertheQuestionContent, AnswertheQuestionContentBckgroundbarClr);

		return this;

}
	public RelistorHomePage VerifyPropCTAHeaderSection(String CTAFontFam,String CTAClr,String CTASize,String CTAWeight,String CTAHeight,String CTABckgroundbarClr,String CTABLocation) {
		WebElement CTAText = locateElement(Locators.XPATH, "//a[@class='gut-button']");
		verifytextFamily(CTAText, CTAFontFam);
		verifytextBackgroundColor(CTAText, CTAClr);
		verifytextSize(CTAText, CTASize);
		verifytextWeight(CTAText, CTAWeight);
		verifytextLineHeight(CTAText, CTAHeight);
		verifyBackgroundColor(CTAText, CTABckgroundbarClr);
		verifyImgSize(CTAText, CTABLocation);
		return this;

}
	public RelistorHomePage VerifyChangesGlobalFooterSection(String MuumanImgFooterAlign,String MuumanImgFooteralt,String MuumanImgFootersrc) {
		WebElement MuumanImgFooter = locateElement(Locators.XPATH, "//img[@alt='Footer Character']");
		scrollToElement(MuumanImgFooter);
		verifytextAlign(MuumanImgFooter, MuumanImgFooterAlign);
		verifyExactAttribute(MuumanImgFooter, "alt", MuumanImgFooteralt);
		verifyExactAttribute(MuumanImgFooter, "src", MuumanImgFootersrc);

		return this;

}
	public RelistorHomePage VerifyChangesBannerImgInSec1(String BannerImg1src,String BannerImg1alt,String BannerImg2src,String BannerImg2alt ,String BannerImg3src,String BannerImg3alt,String BannerImg4src,String BannerImg4alt,String videoplayBtnalt ) {
		WebElement BannerImg1 = locateElement(Locators.XPATH, "//img[@src='/siteassets/img/homenew/img-1929x987-newbanner-1.png']");
		verifyExactAttribute(BannerImg1, "src", BannerImg1src);
		verifyExactAttribute(BannerImg1, "alt", BannerImg1alt);
		reportStep("bannerimg1", "pass");
		WebElement NextArrowMark = locateElement(Locators.XPATH, "//button[text()='Next']");
//		pause(5000);
		scrollByXYoffset(1451, 200);
		click(NextArrowMark);
		WebElement BannerImg2 = locateElement(Locators.XPATH, "//img[@src='/siteassets/img/homenew/img-1929x987-newbanner-2.png']");
		verifyExactAttribute(BannerImg2, "src", BannerImg2src);
		verifyExactAttribute(BannerImg2, "alt", BannerImg2alt);
		click(NextArrowMark);
		WebElement BannerImg3 = locateElement(Locators.XPATH, "//img[@src='/siteassets/img/homenew/img-1929x987-newbanner-3.png']");
		verifyExactAttribute(BannerImg3, "src", BannerImg3src);
		verifyExactAttribute(BannerImg3, "alt", BannerImg3alt);
		click(NextArrowMark);
		WebElement BannerImg4 = locateElement(Locators.XPATH, "//img[@src='/siteassets/img/homenew/img-1929x987-newbanner-4.png']");
		verifyExactAttribute(BannerImg4, "src", BannerImg4src);
		verifyExactAttribute(BannerImg4, "alt", BannerImg4alt);
		click(NextArrowMark);
		WebElement videoplayBtn = locateElement(Locators.XPATH, "//button[@title='Play Video']");
		click(videoplayBtn);
		reportStep("Video has Successfully palyed", "pass");
		pause(3000);

	

		return this;

}	
	public RelistorHomePage VerifyMumanImgInBelowOfAnimation(String MumanimginSec1src,String MumanimginSec1alt,String MumanimginSec1align) {
		WebElement MumanimginSec1 = locateElement(Locators.XPATH, "//img[@alt='home character']");
		scrollToElement(MumanimginSec1);
		verifyExactAttribute(MumanimginSec1, "src", MumanimginSec1src);
		verifyExactAttribute(MumanimginSec1, "alt", MumanimginSec1alt);
		verifytextAlign(MumanimginSec1, MumanimginSec1align);

		return this;

}
	public RelistorHomePage VerifyMumanImgInAboveCloudText(String MumanimginSec1src,String MumanimginSec1alt,String MumanimginSec1align) {
		WebElement MumanimginSec8 = locateElement(Locators.XPATH, "//div[@class='home-character-1']//img[1]");
		scrollToElement(MumanimginSec8);
		verifyExactAttribute(MumanimginSec8, "src", MumanimginSec1src);
		verifyExactAttribute(MumanimginSec8, "alt", MumanimginSec1alt);
		verifytextAlign(MumanimginSec8, MumanimginSec1align);

		
		return this;

}
	public RelistorHomePage VerifyMumanImgInAboutOIC(String MumanimginAboutOICSec1src,String MumanimginAboutOICSec11alt,String MumanimginAboutOICSec1align) {
		WebElement AboutOIC = locateElement(Locators.ID, "about-oic-nav");
		click(AboutOIC);
		WebElement MumanimginAboutOICSec1 = locateElement(Locators.XPATH, "//img[@alt='About']");
		verifyExactAttribute(MumanimginAboutOICSec1, "src", MumanimginAboutOICSec1src);
		verifyExactAttribute(MumanimginAboutOICSec1, "alt", MumanimginAboutOICSec11alt);
		verifytextAlign(MumanimginAboutOICSec1, MumanimginAboutOICSec1align);

		return this;

}
	public RelistorHomePage VerifyMumanImgBelowAnimationNearSlideBarInAboutOIC(String MumanImgNearSlideBaralign,String MumanImg2NearSlideBaralign) {
		WebElement AboutOIC = locateElement(Locators.ID, "about-oic-nav");
		click(AboutOIC);
//		WebElement TextAboveImg = locateElement(Locators.XPATH, "//div[@class='col-12 text-center']//p");
//		scrollToElement(TextAboveImg);
		scrollByXYoffset(1451, 1500);
		WebElement MumanImgNearSlideBar = locateElement(Locators.XPATH, "//div[@class='slider slideActive']");
		verifytextAlign(MumanImgNearSlideBar, MumanImgNearSlideBaralign);
		WebElement MumanImg2NearSlideBar = locateElement(Locators.XPATH, "//div[@class='slider slideActive']");
		verifytextAlign(MumanImg2NearSlideBar, MumanImg2NearSlideBaralign);

		return this;

}
	public RelistorHomePage VerifyMumanImgSec4RightSideInAboutOIC(String MumanImgSec4RightSidesrc,String MumanImgSec4RightSidealt,String MumanImgSec4RightSidealign) {
		WebElement AboutOIC = locateElement(Locators.ID, "about-oic-nav");
		click(AboutOIC);
		WebElement MumanImgSec4RightSide = locateElement(Locators.XPATH, "(//img[@alt='OIC Patient'])[2]");
		scrollToElement(MumanImgSec4RightSide);
		verifyExactAttribute(MumanImgSec4RightSide, "src", MumanImgSec4RightSidesrc);
		verifyExactAttribute(MumanImgSec4RightSide, "alt", MumanImgSec4RightSidealt);
		verifytextAlign(MumanImgSec4RightSide, MumanImgSec4RightSidealign);
		return this;

}
	public RelistorHomePage VerifyMumanImgSec1InAboutRelistor(String MumanImgSec1src,String MumanImgSec1alt,String MumanImgSec1align) {
		WebElement AboutRelistor = locateElement(Locators.ID, "about-relistor-nav");
		click(AboutRelistor);
		WebElement MumanImgSec1 = locateElement(Locators.XPATH, "//img[@alt='About']");
		verifyExactAttribute(MumanImgSec1, "src", MumanImgSec1src);
		verifyExactAttribute(MumanImgSec1, "alt", MumanImgSec1alt);
		verifytextAlign(MumanImgSec1, MumanImgSec1align);
		return this;

}
	public RelistorHomePage VerifyMumanImgSec2InAboutRelistor(String MumanImgSec2src,String MumanImgSec2alt,String MumanImgSec21align) {
		WebElement AboutRelistor = locateElement(Locators.ID, "about-relistor-nav");
		click(AboutRelistor);
		WebElement MumanImg2Sec2 = locateElement(Locators.XPATH, "(//img[@alt='about relistor'])[2]");
		scrollToElement(MumanImg2Sec2);
		verifyExactAttribute(MumanImg2Sec2, "src", MumanImgSec2src);
		verifyExactAttribute(MumanImg2Sec2, "alt", MumanImgSec2alt);
		verifytextAlign(MumanImg2Sec2, MumanImgSec21align);
		return this;

}
	public RelistorHomePage VerifyMumanImgSec1InPatientPerspective(String MumanImg1Sec1src,String MumanImg1Sec1alt,String MumanImg1Sec1align) {
		WebElement PatientPerspective = locateElement(Locators.ID, "apatient-perspectives-nav");
		click(PatientPerspective);
		scrollByXYoffset(1451, 50);
		WebElement MumanImg1Sec1 = locateElement(Locators.XPATH, "//img[@alt='Patient']");
		verifyExactAttribute(MumanImg1Sec1, "src", MumanImg1Sec1src);
		verifyExactAttribute(MumanImg1Sec1, "alt", MumanImg1Sec1alt);
		verifytextAlign(MumanImg1Sec1, MumanImg1Sec1align);
		return this;
	}
	public RelistorHomePage VerifyMumanImgSec1InFAQ(String MumanImg1Sec1src,String MumanImg1Sec1alt,String MumanImg1Sec1align) {
		WebElement FAQ = locateElement(Locators.ID, "faqs-nav");
		click(FAQ);
		scrollByXYoffset(1451, 50);
		WebElement MumanImg1Sec1 = locateElement(Locators.XPATH, "//img[@alt='faq']");
		verifyExactAttribute(MumanImg1Sec1, "src", MumanImg1Sec1src);
		verifyExactAttribute(MumanImg1Sec1, "alt", MumanImg1Sec1alt);
		verifytextAlign(MumanImg1Sec1, MumanImg1Sec1align);
		return this;
	}
	public RelistorHomePage VerifyMumanImgSec1InResources(String MumanImg1Sec1src,String MumanImg1Sec1alt,String MumanImg1Sec1align) {
		WebElement Resources = locateElement(Locators.ID, "resources-nav");
		click(Resources);
		scrollByXYoffset(1451, 50);
		WebElement MumanImg1Sec1 = locateElement(Locators.XPATH, "//img[@alt='Resource']");
		verifyExactAttribute(MumanImg1Sec1, "src", MumanImg1Sec1src);
		verifyExactAttribute(MumanImg1Sec1, "alt", MumanImg1Sec1alt);
		verifytextAlign(MumanImg1Sec1, MumanImg1Sec1align);
		return this;
	}
	public RelistorHomePage VerifyMumanImgSec1NearSlideBarInResources(String MumanImgNearSlideBaralign,String MumanImg2NearSlideBaralign) {
		WebElement Resources = locateElement(Locators.ID, "resources-nav");
		click(Resources);
		scrollByXYoffset(1451, 1500);
		WebElement MumanImgNearSlideBar = locateElement(Locators.XPATH, "//div[@class='slider slideActive']");
		verifytextAlign(MumanImgNearSlideBar, MumanImgNearSlideBaralign);
		WebElement MumanImg2NearSlideBar = locateElement(Locators.XPATH, "//div[@class='slider slideActive']");
		verifytextAlign(MumanImg2NearSlideBar, MumanImg2NearSlideBaralign);
		return this;

}
	public RelistorHomePage VerifyCTACheckyourGut(String CTATextBtnTitle) {
		WebElement StickyBarCTA = locateElement(Locators.CLASS_NAME, "gut-button");
		click(StickyBarCTA);
		switchToWindow("Relistor: Opioid-Induced Constipation Discussion Guide - NOT FOR COMMERCIAL USE");
		verifyTitle(CTATextBtnTitle);

		return this;
	}
}
