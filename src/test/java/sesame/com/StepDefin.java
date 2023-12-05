package sesame.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefin {
	public WebDriver driver;
	
	@Given("I open google search page")
	public void i_open_google_search_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elhab\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.fr/");
	}
	@When("I lookup the word {string}")
	public void i_lookup_the_word(String string) {
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(string);
//		WebElement submit_btn= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
//		JavascriptExecutor javax = (JavascriptExecutor) driver;
//		javax.executeScript("scroll(0,200)");
//		submit_btn.click();
		driver.findElement(By.name("btnK")).click();
	}
	
	@Then("Search results display the word {string}")
	public void search_results_display_the_word(String string)
	{
		System.out.println(driver.getTitle().contains(string));
	}
}