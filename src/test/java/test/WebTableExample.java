package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pojo.WebTable;

public class WebTableExample {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "/Users/deepeshpoonthorakandy/Downloads/chromedriver2");
		driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/webtables");// launch the site
		driver.manage().window().maximize();// maximize the window
		driver.manage().deleteAllCookies();// delete all the cookies
		

		
		List<WebElement> rowList = driver.findElements(By.xpath("//div[@class='rt-tbody']/div[@class='rt-tr-group']"));
		
		WebTable  webTableobject = new WebTable();
		List<WebTable> webList = new ArrayList<WebTable>();
		
		
		
		System.out.println(" rowList " + rowList.size());
		for ( int i = 0; i< rowList.size(); i++) {
			
			  webTableobject = new WebTable();
			
			List<WebElement> tdList = driver.findElements(By.xpath("//div[@class='rt-tbody']/div[@class='rt-tr-group']["+i+"]//div[@class='rt-td']"));
		 
				for(int j=0; j <tdList.size(); j++ ) {
					
					WebElement tdElement = tdList.get(j);
					
					if(tdElement.getText().toString().trim().length() > 0) {
						
						System.out.print("\t" +tdElement.getText());
					
						if(j==0)
						webTableobject.setFname(tdElement.getText());
						if(j==1)
						webTableobject.setLname(tdElement.getText());
						if(j==2)
						webTableobject.setAge(tdElement.getText());
						if(j==3)
						webTableobject.setMail(tdElement.getText());
						if(j==4)
						webTableobject.setSalary(tdElement.getText());
						if(j==5)
						webTableobject.setDept(tdElement.getText());
						
						System.out.println("----");
					}
				}
				
				webList.add(webTableobject);
		}
		
		System.out.println("Done" + webList.size());
		driver.quit();
		
		
		printList(webList);
	}

	private static void printList(List<WebTable> webList) {
	
		
		for( WebTable webt : webList) {
			if(webt.getAge() != null&& webt.getFname() != null && webt.getLname() != null)
			System.out.println(webt.toString());
		}
	}

}