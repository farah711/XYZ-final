package manager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paramiters {
	WebDriver driver = new ChromeDriver() ; 

	String HomePage = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
	String Theuser = "farah mahmoud" ;
	String Currency="Dollar";
	SoftAssert myAssertion = new SoftAssert();


	@BeforeTest
	public void setup() {
		driver.get(HomePage);

		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 

	}
}
