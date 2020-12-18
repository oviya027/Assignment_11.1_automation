import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


 
public class Clear_trip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chrome_browser_driver", "D:\\browser driver\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		// Select ‘Flights’ option
				driver.findElement(By.xpath("//a[@title='Find flights from and to international destinations around the world']")).click();

				// Click on ‘One way’ radio button
				driver.findElement(By.id("OneWay")).click();

				// Enter the ‘From city’ and ‘To city’ details
				WebElement fromcity = driver.findElement(By.xpath("//input[@id='FromTag']"));
				fromcity.sendKeys("Bangalore");
				fromcity.click();

				WebElement tocity = driver.findElement(By.xpath("//input[@id='ToTag']"));
				tocity.sendKeys("New delhi");
				tocity.click();
				
				// Select the date of travel from calendar
				WebElement datepicker = driver.findElement(By.xpath("//input[@id='DepartDate']"));
				datepicker.click();
				datepicker.sendKeys("Sun, 17 Jan, 2021");
				
				// Select number of adults traveling 
				Select drpAdults = new Select (driver.findElement(By.name("adults")));
				drpAdults.selectByValue("1");
				
				// Select number of Children traveling 
				Select drpChildren = new Select (driver.findElement(By.name("childs")));
				drpChildren.selectByValue("1");
				
				// Select number of infants traveling 
				Select drpInfants = new Select (driver.findElement(By.name("infants")));
				drpInfants.selectByValue("1");
				
				// Search for available flights
				driver.findElement(By.id("SearchBtn")).click();
				
				
				
				// Selecting Non-Stop CheckBox
			    WebElement nonstop = driver.findElement(By.xpath("//p[text()='Non-stop']"));									
		        nonstop.click();
		       
		        // Uncheck Mulit-Airway-Itineraries
		        WebElement multiairline = driver.findElement(By.xpath("//p[text()='Show multi-airline itineraries']"));									
		        multiairline.click();
		        
		        // adjust price slider
		        // add code here
		        
		        
		        // Click on book
		        WebElement book = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div[2]/div[8]/div[1]/div[1]/div[2]/div[4]/button"));
		        book.click();
		 
		        //switching window
				Set<String> parentwindow = driver.getWindowHandles();
				Iterator<String> ab = parentwindow.iterator();
				String searchwindowString = ab.next();
				String childwindow = ab.next();
				driver.switchTo().window(childwindow);
				
				/*
				// Select fare type(Standard or Flexi)
		        WebElement fareType = driver.findElement(By.xpath("//input[@id='NORMAL_radio_']"));
				fareType.click();
				*/
				// Click on continue booking
				WebElement continue1 = driver.findElement(By.id("itineraryBtn"));
				continue1.click();
		        
				// Enter EmailID
				WebElement emailId = driver.findElement(By.name("username"));
				emailId.sendKeys("oviya.s@gmail.com");
				emailId.click();
				
				//Click continue
				WebElement continue2 = driver.findElement(By.id("LoginContinueBtn_1"));
				continue2.click();
				
				//Enter traveler details
				
				//Adult details
				//Adult title
				Select Atitle = new Select(driver.findElement(By.id("AdultTitle1")));
				Atitle.selectByVisibleText("Mr");
				
				//Adult first name
				WebElement Adultfname = driver.findElement(By.name("AdultFname1"));
				Adultfname.sendKeys("Sivakumar");
		 		Adultfname.click();
				
		 		//Adult last name
				WebElement Adultlname = driver.findElement(By.name("AdultLname1"));
				Adultlname.sendKeys("Natarajan");
				Adultlname.click();
				
				
				
				//Child details
				//Child title
				Select Ctitle = new Select(driver.findElement(By.id("ChildTitle1")));
				Ctitle.selectByVisibleText("Miss");
				
				//Child first name
				WebElement Childfname = driver.findElement(By.name("ChildFname1"));
				Childfname.sendKeys("Oliva");
				Childfname.click();
				
				//Child last name
				WebElement Childlname = driver.findElement(By.name("ChildLname1"));
				Childlname.sendKeys("Sivakumar");
				Childlname.click();
				
				//Child DOB
				Select Cdatedrop = new Select(driver.findElement(By.cssSelector("#ChildDobDay1")));
				Cdatedrop.selectByValue("7");
				Select Cmonthdrop = new Select(driver.findElement(By.cssSelector("#ChildDobMonth1")));
				Cmonthdrop.selectByVisibleText("Oct");
				Select Cyeardrop = new Select(driver.findElement(By.cssSelector("#ChildDobYear1")));
				Cyeardrop.selectByValue("2013");
				
				//Infant details
				//Infant title
				Select Ititle = new Select(driver.findElement(By.id("InfantTitle1")));
				Ititle.selectByVisibleText("Miss");
				
				//Infant first name
				WebElement Infantfname = driver.findElement(By.name("InfantFname1"));
				Infantfname.sendKeys("kaaviya");
				Infantfname.click();
				
				//Infant last name
				WebElement Infantlname = driver.findElement(By.name("InfantLname1"));
				Infantlname.sendKeys("Sivakumar");
				Infantlname.click();
				
				//Infant DOB
				Select Idatedrop = new Select(driver.findElement(By.cssSelector("#InfantDobDay1")));
				Idatedrop.selectByValue("2");
				Select Imonthdrop = new Select(driver.findElement(By.cssSelector("#InfantDobMonth1")));
				Imonthdrop.selectByVisibleText("Jun");
				Select Iyeardrop = new Select(driver.findElement(By.cssSelector("#InfantDobYear1")));
				Iyeardrop.selectByValue("2019");
				
				
				//Mobile number
				WebElement mobilenum = driver.findElement(By.name("contact1"));
				mobilenum.sendKeys("7395985123");
				mobilenum.click();
				
				//Continue to payment
				WebElement continue3 = driver.findElement(By.id("travellerBtn"));
				continue3.click();
				
				
				
				Thread.sleep(3000);
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
}
}