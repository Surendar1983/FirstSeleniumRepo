
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Webdriver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WrapperClass wc = new WrapperClass();
		//wc.LoadDriver();
		wc.readExcel();
		//wc.registration();
		//driver.wait(10);
		//driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/div/div/nav/div[1]/div/div[2]/div[4]/div/div/a/span[2]")).click();
		 //File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 //FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
		//System.out.println(driver.getTitle());
		//driver.close();
	}

}
