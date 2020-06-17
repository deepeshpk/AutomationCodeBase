package page;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

	// Finding Check out button
	@FindBy(xpath = "//ul[@class='primary-links-list']//li//a[contains(text(),'My Health')]")
	WebElement homepageVar;

	public HomePage() throws Exception {

		PageFactory.initElements(driver, this);
	}

	public boolean isMenuIconExist() throws InterruptedException {
		System.out.println("Welcome to Hpp.kasierpermanaente");
		Thread.sleep(10000);
		if (homepageVar.isDisplayed()) {
			return true;
		}
		return false;
	}

}
