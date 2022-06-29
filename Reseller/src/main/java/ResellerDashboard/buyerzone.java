package ResellerDashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class buyerzone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Chrome webdriver\\chromedriver.exe");

			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://ph-uat.peerconnexions.com");
			
			//Sign/Register
			WebElement Signin = driver.findElement(By.xpath("//*[@id=\'site-header\']/div[1]/div/div/div[9]/a/span[1]"));
			Signin.click();
			Thread.sleep(2000);
			
			//Credentials
			WebElement  emailbox = driver.findElement(By.name("email"));
			emailbox.sendKeys("ravindrah+demoreseller1@openspaceservices.com");
			
			WebElement passwordbox =driver.findElement(By.name("password"));
			passwordbox.sendKeys("Round@123");
			
			WebElement m =driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div/div/div/div[2]/div/form/div[3]/button"));
			JavascriptExecutor j =(JavascriptExecutor) driver;
			j.executeScript("arguments[0].click();",m);
			
			Thread.sleep(2000);
			
			//BuyerZone
			WebElement buyerzone=driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[2]/div/div/div[2]/div/nav/div/ul/li[4]/a/span"));
			buyerzone.click();
			
			Thread.sleep(2000);
			
			//My Dashboards
			
			WebElement mydashboard = driver.findElement(By.xpath("//*[@id=\'site-header\']/div[2]/div/div/div[2]/div/nav/div/ul/li[4]/div/button[3]/a/span"));
			mydashboard.click();
			

			
			
			//Sales Report
			//Date range
			
			WebElement datebox =driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[1]/span/span"));
			datebox.click();
			
			//Start date
			
			WebElement startdate =driver.findElement(By.cssSelector("body.language-en:nth-child(2) div.ant-calendar-picker-container.ant-calendar-picker-container-placement-bottomLeft div.ant-calendar.ant-calendar-range div.ant-calendar-panel div.ant-calendar-date-panel div.ant-calendar-range-part.ant-calendar-range-left:nth-child(1) div.ant-calendar-input-wrap:nth-child(1) div.ant-calendar-date-input-wrap > input.ant-calendar-input"));
            startdate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
            startdate.sendKeys(Keys.BACK_SPACE);
            startdate.sendKeys("05-01-2018");
            
          //End Date
    		
    		WebElement enddate =driver.findElement(By.cssSelector("body.language-en:nth-child(2) div.ant-calendar-picker-container.ant-calendar-picker-container-placement-bottomLeft div.ant-calendar.ant-calendar-range div.ant-calendar-panel div.ant-calendar-date-panel div.ant-calendar-range-part.ant-calendar-range-right:nth-child(3) div.ant-calendar-input-wrap:nth-child(1) div.ant-calendar-date-input-wrap > input.ant-calendar-input"));
    		enddate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
    		enddate.sendKeys(Keys.BACK_SPACE);
    		enddate.sendKeys("07-01-2022"+Keys.ENTER);
    		Thread.sleep(3000);
    		
    		
    		//JavascriptExecutor s = (JavascriptExecutor) driver;
    		//s.executeScript("window.scrollBy(0,110)");
    		//Thread.sleep(3000);
    		//System.out.println("Scrolled down..");
    		
    		//Search
    		WebElement search =driver.findElement(By.cssSelector("body.language-en:nth-child(2) div.site div.site__body:nth-child(3) div.block.full-card div.container-fluid div.row div.col-12.col-lg-10.mt-4.mt-lg-0:nth-child(2) div.card div.reseller-table-div.registration-summary-inn.reseller-sales-dashboard div.ant-tabs.ant-tabs-top.ant-tabs-line div.ant-tabs-content.ant-tabs-content-animated.ant-tabs-top-content:nth-child(3) div.ant-tabs-tabpane.ant-tabs-tabpane-active:nth-child(1) div.table-responsive:nth-child(2) div.ant-table-wrapper div.ant-spin-nested-loading div.ant-spin-container div.ant-table.ant-table-default.ant-table-bordered.ant-table-scroll-position-left div.ant-table-content div.ant-table-body thead.ant-table-thead:nth-child(2) span.ant-table-header-column div:nth-child(1) span.ant-table-column-title div:nth-child(1) span.ant-input-affix-wrapper > input.ant-input"));
    		search.click();
    	    search.sendKeys("Demo Distributor Company Two");
    	    search.sendKeys(Keys.chord(Keys.CONTROL,"a"));
    	    Thread.sleep(3000);
    	    search.sendKeys(Keys.DELETE);
    	    Thread.sleep(3000);
    	    
    	  JavascriptExecutor s = (JavascriptExecutor) driver;
    	  s.executeScript("window.scrollBy(0,50)");
    	  Thread.sleep(3000);
    	  System.out.println("Scrolled down..");
    	  
    	    //Plus
  	    WebElement plus1 =driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]"));
  	    plus1.click();
  	    Thread.sleep(3000);
  	    WebElement plus2 =driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]"));
  	    plus2.click();
  	    Thread.sleep(3000);
  	    
  	    //Minus
  	    WebElement minus1 =driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]"));
  	    minus1.click();
  	    Thread.sleep(2000);
  	    WebElement minus2 =driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]"));
  	    minus2.click();
  	    Thread.sleep(2000);
  	    
  		 
  		
  		WebElement s1 = driver.findElement(By.xpath("//*[@id=\'root\']/div[3]/div/div[2]/div/div/div[2]/div/div[4]/div[2]/div[3]/div[1]/div[2]/div/div/div/div/div/div/table/thead/tr/th[3]/span/div/span[1]/div/span/input"));
  		s1.click();
  		s1.sendKeys("PH_");
  		s1.sendKeys("ODOR29031434_");
  		s1.sendKeys("3106_");
  		s1.sendKeys("5277940");
  		//Thread.sleep(3000);
  		s1.sendKeys(Keys.chord(Keys.CONTROL,"a"));
  		//Thread.sleep(5000);
  		WebElement cancel =driver.findElement(By.xpath("//thead/tr[1]/th[3]/span[1]/div[1]/span[1]/div[1]/span[1]/span[1]/i[1]/*[1]"));
  		cancel.click();
  		//s1.sendKeys(Keys.chord(Keys.CONTROL,"a"));
  		//Thread.sleep(3000);
  		
  		//Date Sorting
  		WebElement datedes = driver.findElement(By.xpath("//thead/tr[1]/th[4]/span[1]/div[1]/span[2]/div[1]/i[2]/*[1]"));
  		datedes.click();
  		Thread.sleep(2000);
  		WebElement datease =driver.findElement(By.xpath("//thead/tr[1]/th[4]/span[1]/div[1]/span[2]/div[1]/i[1]/*[1]"));
  		datease.click();
  		Thread.sleep(3000);
  		
  		//Date Order value
  		WebElement orderdes = driver.findElement(By.xpath("//thead/tr[1]/th[5]/span[1]/div[1]/span[2]/div[1]/i[2]/*[1]"));
  		orderdes.click();
  		Thread.sleep(3000);
  		WebElement orderase = driver.findElement(By.xpath("//thead/tr[1]/th[5]/span[1]/div[1]/span[2]/div[1]/i[2]/*[1]"));
  		orderase.click();	
  		
  	//Scroll by pixel
  			//JavascriptExecutor js = (JavascriptExecutor) driver;
  			//js.executeScript("window.scrollBy(0,80)");
  			Thread.sleep(3000);
  			//System.out.println("Scrolled down..");
  			
  			//Filter Menu
  			WebElement filtermenu =driver.findElement(By.xpath("//thead/tr[1]/th[6]/i[1]/*[1]"));
  			filtermenu.click();
  			//Thread.sleep(1000);
  			
  			//Part fulfilled
  			WebElement partcheckbox =driver.findElement(By.cssSelector("body.language-en:nth-child(2) div.ant-dropdown.ant-dropdown-placement-bottomRight div.ant-table-filter-dropdown ul.ant-dropdown-menu.ant-dropdown-menu-without-submenu.ant-dropdown-menu-root.ant-dropdown-menu-vertical li.ant-dropdown-menu-item:nth-child(2) > label.ant-checkbox-wrapper:nth-child(1)"));
  			partcheckbox.click();
  			Thread.sleep(3000);
  			//OK Button
  			WebElement okbutton =driver.findElement(By.xpath("//a[contains(text(),'OK')]"));
  			okbutton.click();
  			Thread.sleep(3000);
  			
  			WebElement filtermenu1 =driver.findElement(By.xpath("//thead/tr[1]/th[6]/i[1]/*[1]"));
  			filtermenu1.click();
  			Thread.sleep(3000);
  			//Reset Button
  			WebElement resetbutton =driver.findElement(By.xpath("//a[contains(text(),'Reset')]"));
  			resetbutton.click();
  			Thread.sleep(3000);
  			
  			//Scroll down with action
  			Actions act =new Actions(driver);
  			act.sendKeys(Keys.PAGE_DOWN).build().perform();
  			Thread.sleep(3000);
  			
  			System.out.println("Scroll down performed");
  			
  			//Page navigation
  			WebElement page1 =driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[10]/a[1]"));
  			page1.click();
  			Thread.sleep(2000);
  			//WebElement page2 = driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]"));
  			//page2.click();
  			//Thread.sleep(3000);
  			
  			WebElement pagedropdown=driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[11]/div[1]/div[1]/span[1]/i[1]/*[1]"));
  			pagedropdown.click();
  			//WebElement pagedrop1 =driver.findElement(By.xpath("//li[contains(text(),'30 / page')]"));
  			//pagedrop1.click();
  			
  			Thread.sleep(3000);
  			
  			
  			WebElement typepage =driver.findElement(By.xpath("//body/div[@id='root']/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[11]/div[2]/input[1]"));
  			typepage.click();
  			typepage.sendKeys("1"+Keys.ENTER);
  			
  			Actions ac = new Actions(driver);
  			ac.sendKeys(Keys.PAGE_UP).build().perform();
  			System.out.println("Scroll up performed");
  			Thread.sleep(3000);
  			

  			//Download Excel1
  			WebElement e1 = driver.findElement(By.cssSelector("body.language-en:nth-child(2) div.site div.site__body:nth-child(3) div.block.full-card div.container-fluid div.row div.col-12.col-lg-10.mt-4.mt-lg-0:nth-child(2) div.card div.card-body.pl-3.pr-3.pb-2.pt-2 div.col-md-12 div.row div.col-md-5.p-0.text-right:nth-child(3) a.btn.btn-secondary.mr-2 > span:nth-child(2)"));
  			e1.click();
  			Thread.sleep(2000);
  			
  		
	}

}
