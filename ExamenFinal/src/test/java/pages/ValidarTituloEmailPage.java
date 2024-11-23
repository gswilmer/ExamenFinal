package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidarTituloEmailPage {
	
	WebDriver driver;
	By email = By.cssSelector("label");
	public ValidarTituloEmailPage (WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}

}
