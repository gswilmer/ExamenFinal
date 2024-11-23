package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailsJobsPages {
	WebDriver driver;
	
	public DetailsJobsPages(WebDriver driver) {
		this.driver = driver;
	}
	
	By tituloJobs = By.cssSelector(".job-ad-display-29uigd");
	By btnApply = By.cssSelector(".job-ad-wrapper [data-genesis-element='CARD_CONTENT'] > [data-genesis-element='BASE']:nth-of-type(2) > [data-genesis-element] > [data-genesis-element='BASE']:nth-of-type(1) button");
	
	public WebElement getTituloJobs() {
		return driver.findElement(tituloJobs);		
	}

	public WebElement getBtnApply() {
		return driver.findElement(btnApply);		
	}


}
