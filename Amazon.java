package amazon.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=6642978380365059298&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
    driver.manage().window().maximize();
    boolean logo= driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
    System.out.println(logo);
    WebElement searchbar=driver.findElement(By.xpath("//input[@type='text']"));
    searchbar.click();
    searchbar.sendKeys("pocomobiles");
    WebElement searchbarbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
    searchbarbutton.click();
    WebElement mobile=driver.findElement(By.xpath("(//span[@style='height: 2.6em;'])[2]"));
    mobile.click();
    WebElement buynow=driver.findElement(By.xpath("//input[@id='buy-now-button']"));
    buynow.click();
    
    WebElement signup=driver.findElement(By.xpath("//input[@type='email']"));
    signup.click();
    signup.sendKeys("8428328158");
    WebElement continueclick=driver.findElement(By.xpath("//input[@id='continue']"));
    continueclick.click();
    WebElement password=driver.findElement(By.xpath("//input[@tabindex='6']"));
    password.click();    		
	
	}

}
