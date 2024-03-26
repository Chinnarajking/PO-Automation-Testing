package Helpers;


import java.time.LocalDate;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch(String url) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get(url);

		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getTitle());
	}

	public static void inputText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void enter(WebElement element) {
		element.sendKeys(Keys.ENTER);
	}

	public void cleartext(WebElement element) {
		element.clear();
	}

	public static void dropDownText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}
	
	public void JavaScriptExecutor(WebElement element, String text) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].value = arguments[1];", element, text);
    }
	
	 public void scrollDown() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,500)");
	    }

	/* public static void takeScreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination); 

	} */

	public static void printValue(WebElement element) {
		element.getAttribute("Value");
	}

	public static void getText(WebElement element) {
		System.out.println(element.getText());
	}

	public void DoubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();
	}

	public static void assertTextEquals(WebElement element, String expectedText) {
		String actualText = element.getText();
		Assert.assertEquals(actualText, expectedText);
	}

	public LocalDate currentDate() {
		LocalDate currentDate = LocalDate.now();
		return currentDate;
	}
	public LocalDate futureDate(int val) {
		LocalDate currentDate = LocalDate.now();
		LocalDate futureDate = currentDate.plusDays(val);
		return futureDate;
}
	
}