package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Client {
	final WebDriver driver;

	public Client() {
		this.driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	public void openPage(String url) {
		driver.get(url);
	}

	public void stop() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public <T> T waitUntil(ExpectedCondition<T> condition, int timeout) {
		Wait<WebDriver> wait = new WebDriverWait(driver, timeout);
		return wait.until(condition);
	}
}
