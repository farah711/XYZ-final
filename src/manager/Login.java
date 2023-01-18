package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test(priority = 1)
public class Login extends Paramiters{
	public void LoginAsManager() {
		driver.get(HomePage);
	WebElement ManagerLoginButton=	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button"));
	ManagerLoginButton.click();
	WebElement AddCustomerButton =driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]"));
	AddCustomerButton.click();
	WebElement FirstNameInput=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
	FirstNameInput.sendKeys("farah");
	WebElement LastNameInput=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
	LastNameInput.sendKeys("mahmoud");
	WebElement PostCodeInput= driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
	PostCodeInput.sendKeys("71198");
	WebElement AddCustomer =driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
	AddCustomer.click();
	String Msg = driver.switchTo().alert().getText();
	myAssertion.assertEquals(Msg.contains("successfully"), true);
	myAssertion.assertAll();
	driver.switchTo().alert().accept();
	}
	@Test (priority = 2)
	public void OpenAccount() {
		
		WebElement ManagerAddAccountButton=	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]"));
		ManagerAddAccountButton.click();
		
		WebElement TheSelectWebElementforCustomerName = driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));

		Select CustomerNameSelect = new Select(TheSelectWebElementforCustomerName);

		CustomerNameSelect.selectByVisibleText(Theuser);
		
		WebElement TheSelectForCurrency=driver.findElement(By.xpath("//*[@id=\"currency\"]"));
		Select CurrencySelect= new Select(TheSelectForCurrency);
		CurrencySelect.selectByVisibleText(Currency);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
		String Msg = driver.switchTo().alert().getText();
		myAssertion.assertEquals(Msg.contains("successfully"), true);
		myAssertion.assertAll();
		driver.switchTo().alert().accept();
	}
	@Test(priority=3)
	public void CustomerDelete() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]")).click();
		WebElement SearchInput= driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input"));
		SearchInput.sendKeys(Theuser);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[5]/button")).click();
		myAssertion.assertAll();
	}
	}
