package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selprac {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//input[@id='name'][@placeholder='Enter Name']")).sendKeys("syed");
		
		String txt=driver.findElement(By.xpath("//a[text()='Data Entry Form']")).getText();
		
		System.out.println(txt);
		
		//contains method
		
		String txt2=driver.findElement(By.xpath("//span[contains(text(),'Cypress')]")).getText();
		
		System.out.println(txt2);
		
		//starts-with()
		
		String txt3=driver.findElement(By.xpath("//a[starts-with(text(),'Ho')]")).getText();
		
		System.out.println(txt3);
		
		// using getAttribute method
		String elementvalue=driver.findElement(By.xpath("//button[@class='start']")).getAttribute("onclick");
		
		System.out.println(elementvalue);
		
		
		//conditions methods
         WebElement vl=driver.findElement(By.xpath("//a[starts-with(text(),'Ho')]"));
         
        System.out.println(vl.isDisplayed() + " : The text is displayed ");
        
        WebElement cbox=driver.findElement(By.xpath("//input[@type='checkbox'][@value='sunday']"));   
        
      cbox.click();
      
      System.out.println(cbox.isSelected() + " :  box is selected ");
      
     WebElement btn = driver.findElement(By.xpath("//button[@class='submit-btn']"));
     
    System.out.println(btn.isEnabled() + " : button is enabled");    
      
    System.out.println(cbox.isEnabled() + " : c box is enabled ");
		
    driver.navigate().refresh();
    
    List <WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox'][@class='form-check-input']"));
    
    for (WebElement ls: list) {
    	
    	if(!ls.isSelected()) {
    		
    		ls.click();
    		
    		System.out.println(" success its selected all ");
    	}
    }
    
   for (WebElement ls: list) {
    	
    	if(ls.isSelected()) {
    		
    		ls.click();
    		
    		System.out.println(" success its selected all ");
    	}
    }


		
	}

}
