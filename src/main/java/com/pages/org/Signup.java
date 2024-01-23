package com.pages.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {

	public WebDriver driver;

	public Signup(WebDriver Signupdriver) {
		this.driver = Signupdriver;
		PageFactory.initElements(Signupdriver, this);
	}

	@FindBy(xpath = "//a[text()='Sign up']")
	private WebElement signupClick;

	@FindBy(xpath = "//input[@id='sign-username']")
	private WebElement signupUsername;

	@FindBy(xpath = "//input[@id='sign-password']")
	private WebElement signupPassword;

	@FindBy(xpath = "//button[text()='Sign up']")
	private WebElement signupButton;

	public WebElement getSignupClick() {
		return signupClick;
	}

	public void setSignupClick(WebElement signupClick) {
		this.signupClick = signupClick;
	}

	public WebElement getSignupUsername() {
		return signupUsername;
	}

	public void setSignupUsername(WebElement signupUsername) {
		this.signupUsername = signupUsername;
	}

	public WebElement getSignupPassword() {
		return signupPassword;
	}

	public void setSignupPassword(WebElement signupPassword) {
		this.signupPassword = signupPassword;
	}

	public WebElement getSignupButton() {
		return signupButton;
	}

	public void setSignupButton(WebElement signupButton) {
		this.signupButton = signupButton;
	}

}
