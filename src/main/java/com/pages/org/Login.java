package com.pages.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;

	public Login(WebDriver Logindriver) {
		this.driver = Logindriver;
		PageFactory.initElements(Logindriver, this);
	}

	@FindBy(xpath = "//div[@id='navbarExample']//child::a[text()='Log in']")
	private WebElement loginClick;

	@FindBy(xpath = "//input[@id='loginusername']")
	private WebElement loginUsername;

	@FindBy(xpath = "//input[@id='loginpassword']")
	private WebElement loginPassword;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginButton;

	public WebElement getLoginClick() {
		return loginClick;
	}

	public void setLoginClick(WebElement loginClick) {
		this.loginClick = loginClick;
	}

	public WebElement getLoginUsername() {
		return loginUsername;
	}

	public void setLoginUsername(WebElement loginUsername) {
		this.loginUsername = loginUsername;
	}

	public WebElement getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(WebElement loginPassword) {
		this.loginPassword = loginPassword;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

}
