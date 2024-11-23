package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultadoBusquedaPage {
	WebDriver driver;
	 
	By titulo = By.cssSelector("h1");
	By aplicarTrabajo = By.cssSelector(".res-ksz0ic > div[role='group'] > article:nth-of-type(1) > .res-urswt  .res-1foik6i .res-nehv70");
 
	public ResultadoBusquedaPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getTitulo() {
		return driver.findElement(titulo);
	}
	public WebElement getAplicarTrabajo() {
		return driver.findElement(aplicarTrabajo);
	}

}
