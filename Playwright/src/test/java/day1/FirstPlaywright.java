package day1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import utility.Utility;

public class FirstPlaywright extends Utility{

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://demowebshop.tricentis.com/");
		String title = page.title();
		System.out.println("Page Title: " + title);
		
		page.locator("a.ico-register").click();
		page.locator("#gender-male").click();
		page.locator("#FirstName").fill(generateRandomName());
		page.locator("#LastName").fill(generateRandomName());
		page.locator("#Email").fill("test@gmail.com");
		page.locator("#Password").fill("Tamil*1106");
		page.locator("#ConfirmPassword").fill("Tamil*1106");
		System.out.println("Script Execution completed");
		
		page.close();
		browser.close();
		playwright.close();
	}

}
