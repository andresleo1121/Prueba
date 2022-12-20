package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Esta clase se encuentra la "logica" del proyecto, esta ordenado que metodos cambiar si 
 * en algun momento falla el proyecto 
 * @author ANDRES PINEDA
 *
 */

public class LoginPage {
	
	
	
	WebDriver driver;
	
	String url= ("https://www.falabella.com.co/falabella-co");
	By closevent= By.className("dy-lb-close");
	By clickIni= By.xpath("//li[@id='testId-UserAction-userinfo']/div/div[2]");
	By name= By.xpath("//input[@id='testId-cc-login-form-email-input']");
	By password= By.xpath("//input[@id='testId-cc-login-form-password-input']");
	By login = By.xpath("//button[@id='testId-cc-login-form-submit']/span");
	
	By categories1= By.id("testId-HamburgerBtn-toggle");
	By tecnologia= By.xpath("//header[@id='cross-header']/div[3]/div/div[2]/div/ul/li/div/p");
	By streaming= By.xpath("//a[contains(text(),'Streaming')]");
	By ordenar= By.xpath("//button[@id='testId-Dropdown-desktop-button']");
	By pricelow= By.xpath("//button[@id='testId-Dropdown-Precio de menor a mayor']");
	By tv = By.xpath("//a[contains(text(),'Televisores')]");
	By marca= By.id("testId-Accordion-Marca");
	By namemarca = By.id("testId-Multiselect-Marca");
	By seleccionarsamsung= By.id("SAMSUNG-83");
	By addbag = By.xpath("//div[3]/button/div/div");
	By seebag = By.id("linkButton");
	By pc = By.xpath("//a[contains(text(),'Gaming')]");
	By pricepc = By.xpath("//button[@id='testId-Accordion-Precio']");
	By selectprice= By.xpath("//input[@id='$2.000.000---$4.000.000-12']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// Metodo para entrar a la pagina web
	
	public void enterWeb() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(closevent).click();
		
		
	}
	
	//Metodo login
	
	public void enterLogin()
	{
		driver.findElement(clickIni).click();
		driver.findElement(name).sendKeys("pinedaandres271@gmail.com");
		driver.findElement(password).sendKeys("Manuela2022@");
		driver.findElement(login).click();
		
	}

	//Metodo Seleccionar Streaming
	
	public void clickStreaming() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(categories1).click();
		Thread.sleep(1000);
		driver.findElement(tecnologia).click();
		driver.findElement(streaming).click();		
		
	}
	
	//Metodo Seleccionar Precio
	
	public void selectPrice() throws InterruptedException
	{
		driver.findElement(ordenar).click();
		Thread.sleep(1000);
		driver.findElement(pricelow).click();
		Thread.sleep(9000);
		
		
	}
	
	//Metodo seleccionar categorias  tv
	
	public void clickCategoriesTv() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(categories1).click();
		Thread.sleep(1000);
		driver.findElement(tecnologia).click();
		driver.findElement(tv).click();		
		
	}
	
	//Metodo para filtrar 
	
	public void clickFilterBrand() throws InterruptedException
	{
		
		Thread.sleep(1000);
		driver.findElement(marca).click();
		Thread.sleep(1000);
		driver.findElement(namemarca).sendKeys("samsung");
		Thread.sleep(3000);
		driver.findElement(seleccionarsamsung).click();
		
		
		
	}
	
	//Metodo para seleccionar producto
	
	public void clickProduct() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.findElement(addbag).click();
		Thread.sleep(10000);
		driver.findElement(seebag).click();
		
		
		
		
	}
	
	public void clickCategoriesPc() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(categories1).click();
		Thread.sleep(1000);
		driver.findElement(tecnologia).click();
		driver.findElement(pc).click();	
		
		
		
	}
	
	public void clickPricePc() throws InterruptedException
	{
			
		Thread.sleep(2000);
		driver.findElement(pricepc).click();
		Thread.sleep(2000);
		driver.findElement(selectprice).click();
		
		
	}
	
	public void closeWindow() throws InterruptedException
	{
			
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
	
	
	
}
