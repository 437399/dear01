package hellodear01;
import java.io.File;
import org.openqa.selenium.os.WindowsUtils;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.james.mime4j.field.datetime.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.SystemClock;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.WindowUtils;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;

public class lohit01 {
	
	@Test()
	public void launch(){
	    WindowUtils.tryToKillByName("firefox.exe"); 
		String path="D:\\Selenium\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("D:\\Selenium\\SeleniumTraining\\"+java.time.LocalDateTime.now()+"Screenshomain_page.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.name("userName")).sendKeys("jeetendra");
		driver.findElement(By.name("password")).sendKeys("jitendra");
		driver.findElement(By.name("login")).click();
		
		Select Passsel=new Select(driver.findElement(By.name("passCount")));
		System.out.println(Passsel.isMultiple());
		System.out.println(Passsel.getOptions().size());
		//Passsel.selectByIndex(2);
		for(WebElement counti:Passsel.getOptions()){
			System.out.println(counti.getText());
			if(counti.getText().equals("3")){
				Passsel.selectByVisibleText("3");
			break;
		}
		
		
	}

	
}
}