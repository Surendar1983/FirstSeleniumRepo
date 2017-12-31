import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*; 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class WrapperClass {
	WebDriver driver;
	ArrayList val = new ArrayList();
	String email;
	String customerFirstName;
	String customerLastName;
	String pwd;
	String company;
	String address;
	String city;
	String postcode;
	String mobile;
	String allias;
	//private static final String FILE_NAME = "D:/Selenium/Project.xlsx";
	public void LoadDriver()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
	}
	public void readExcel() throws IOException
	{ 
			FileInputStream excelFile = new FileInputStream("D:/Selenium/Project.xlsx");
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            System.out.println("Row number"+datatypeSheet.getLastRowNum());
            
            for(int i=1;i<datatypeSheet.getLastRowNum();i++)
            {
           Row rw =datatypeSheet.getRow(i);
           for(int j=0;j<rw.getLastCellNum();j++)
           {
           Cell cell=rw.getCell(j);
           //System.out.println(cell.toString());
           val[j]=cell.toString();
           System.out.println(val[j]);
           }    
           
            }
          
           
                }
	public void registration() 
	{
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("mailtosurendar@yahoo.co.in");
		driver.findElement(By.id("SubmitCreate")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender1")));
		WebElement radioButton = driver.findElement(By.id("id_gender1"));
		radioButton.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Surendar");
		driver.findElement(By.id("customer_lastname")).sendKeys("Madhavan");
		driver.findElement(By.id("passwd")).sendKeys("Lotus@123");
		//driver.findElement(By.id("id_gender1")).click();
		Select dobdate =new Select(driver.findElement(By.id("days")));
		dobdate.selectByValue("12");
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("months")));
		Select dobmonth =new Select(driver.findElement(By.id("months")));
		dobmonth.selectByIndex(3);
		Select dobyear =new Select(driver.findElement(By.id("years")));
		dobyear.selectByValue("1983");
		driver.findElement(By.id("company")).sendKeys("TCS");
		driver.findElement(By.id("address1")).sendKeys("FLAT C,Swetha Appartments");
		driver.findElement(By.id("city")).sendKeys("Madurai");
		Select state =new Select(driver.findElement(By.id("id_state")));
		state.selectByIndex(2);
		driver.findElement(By.id("postcode")).sendKeys("99559");
		Select country =new Select(driver.findElement(By.id("id_country")));
		country.selectByIndex(1);
		driver.findElement(By.id("phone_mobile")).sendKeys("7898765432");
		driver.findElement(By.id("alias")).sendKeys("Suren");
		driver.findElement(By.id("submitAccount")).click();
	}
	

}
