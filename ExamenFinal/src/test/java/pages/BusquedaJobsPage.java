package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusquedaJobsPage {
WebDriver driver;
	
	public BusquedaJobsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By tituloJobs = By.cssSelector(".job-ad-display-29uigd"); 
		
		By cokies = By.xpath("//*[@id=\"ccmgt_explicit_accept\"]/div");
		By search = By.cssSelector(".sbr-uliqdc > .sbr-5x1c88 > .sbr-vurnku > .sbr-vurnku > .sbr-14wu849 > input[role='combobox']"); 
		By btnSearch = By.cssSelector("#app-searchBar > div > div > div > div > div > div.sbr-fbczd8 > button > span > span");
		
		public WebElement getCokies() {
			return driver.findElement(cokies);		
		}
		
		public WebElement getSearch() {
			return driver.findElement(search);		
		}
		
		public WebElement getBtnSearch() {
			return driver.findElement(btnSearch);		
		}
		
 
}
