package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.BusquedaJobsPage;
import pages.DetailsJobsPages;
import pages.ResultadoBusquedaPage;
import pages.ValidarTituloEmailPage;

public class JobsTest {

	WebDriver driver;

	@BeforeSuite
	public void iniciarNavegador() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Tools\\Curso Automatizacion\\Dependecias\\chromedriver-win64\\chromedriver_131.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	@BeforeMethod
	public void f() {
		driver.get("https://www.irishjobs.ie/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void DetailsJobs() {

		BusquedaJobsPage busqueda = new BusquedaJobsPage(driver);
		
		DetailsJobsPages jobDetails = new DetailsJobsPages(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		busqueda.getCokies().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		busqueda.getSearch().sendKeys("QA Automation");
		busqueda.getBtnSearch().click();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		ResultadoBusquedaPage busquedaR = new ResultadoBusquedaPage(driver);
		//validar Titulo de la pagina
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement tituloPagina = driver.findElement(By.cssSelector("h1"));
	    Assert.assertTrue(tituloPagina.getText().contains("Automation jobs"), "El titulo no contiene Automation Jobs");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		busquedaR.getAplicarTrabajo().click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Assert.assertTrue((jobDetails.getTituloJobs()).getText().contains("QA Automation"), "Oferta de trabajo no contiene QA Automation");
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		jobDetails.getBtnApply().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ValidarTituloEmailPage tituloEmail = new ValidarTituloEmailPage(driver);
		Assert.assertTrue((tituloEmail.getEmail()).getText().contains("Email address"), "Pagina no contiene texto Email address");
	}
	
	
	@AfterSuite (enabled = true)
	public void cerrarNavegador() {
		driver.close();
		driver.quit();
	}
}
