package com.ondot.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailPage {

	public static WebDriver driver;
	// public static WebElement element;

	static By UserName = By.xpath("//input[@id='Email']");
	static By NxtButtonUname = By.xpath("//input[@id='next']");
	static By FindMyAccountLink = By.xpath("//div[@id='gaia_firstform']/div/a");
	static By CreateAccountLink = By.xpath("//span[@id='link-signup']/a");
	static By PageHeader1 = By.xpath("//div[@class='banner']/h1");
	static By Pwd = By.xpath("//input[@id='Passwd']");
	static By SignInBtn = By.xpath("//input[@id='signIn']");
	static By ForgotPwd = By.xpath("//a[@id='link-forgot-passwd']");
	static By SignInWithDiffAcc = By.xpath("//span[@id='link-signin-different']/a");
	static By CheckBoxofPage = By.xpath("//input[@id='PersistentCookie']");

	public GmailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUname(String Username) {
		driver.findElement(UserName).clear();
		driver.findElement(UserName).sendKeys(Username);
	}

	public void clickNextBtn() {
		String btnText = driver.findElement(NxtButtonUname).getText();
		driver.findElement(NxtButtonUname).click();
		System.out.println(btnText);
	}

	public void clickFindMyAccount() {
		String FindMyAccTxt = driver.findElement(FindMyAccountLink).getText();
		if (FindMyAccTxt.equals("Find my account")) {
			driver.findElement(FindMyAccountLink).click();
		}
	}

	public void setPassword(String Password) {
		driver.findElement(Pwd).clear();
		driver.findElement(Pwd).sendKeys(Password);
	}

	public void checkBoxClick() {
		for (int i = 0; i < 2; i++) {
			Boolean b = driver.findElement(CheckBoxofPage).isSelected();
			if (b == true) {
				driver.findElement(CheckBoxofPage).click();
				System.out.println(false);
			} else {
				driver.findElement(CheckBoxofPage).click();
				System.out.println(false);

			}

		}

	}

	public void submitSignIn() {
		String SignInBtnTxt = driver.findElement(SignInBtn).getText();
		if (SignInBtnTxt.equals("Sign in")) {
			driver.findElement(SignInBtn).click();
			
			
			
		}

	}

}
