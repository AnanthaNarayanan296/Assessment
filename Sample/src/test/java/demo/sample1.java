package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {
	WebDriver driver;
	@Given("the user launches the amazon url")
	public void the_user_launches_the_amazon_url(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
	}
	@Then("^the user searches the \"([^\"]*)\" in search bar$")
    public void search(String keyword) {
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(keyword);
        driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();

    }
    @Then("^the user selects the Apple Iphone option$")
    public void iphone(){
        driver.findElement(By.linkText("Apple iPhone 12, 64GB, Black - Fully Unlocked (Renewed)")).click();
        driver.close();
    }

}
