package common;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;

import Keywords.Keyword;

public class RunTestCases {
	public static void main(String... args) throws IOException, InstantiationException, 
	IllegalAccessException, ClassNotFoundException{
		WebDriver driver = null;
		try {
			ApplicationProperties.readProperties();
			System.setProperty("webdriver.chrome.driver", ApplicationProperties.getChromeDriverPath());
			System.setProperty("webdriver.ie.driver", ApplicationProperties.getIeDriverPath());	
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
			driver = ApplicationProperties.launchDriver();
			driver.get(ApplicationProperties.getURL());
			String action;
			List<String> params = new ArrayList<>();
			//InputStream inputStream = new FileInputStream(new File("C:/Prakash/Selenium_Training/TestCases.xls"));
			InputStream inputStream =  RunTestCases.class.getClassLoader().getResourceAsStream("TestCases.xls");
			Workbook wb = new HSSFWorkbook(inputStream);
			Sheet testPlansheet = wb.getSheet("TestPlan1");
			Iterator<Row> rows = testPlansheet.rowIterator();
			while (rows.hasNext()) {
				params.clear();
				Row row = rows.next();
				Iterator<Cell> cells = row.cellIterator();
				action = cells.next().toString();
				System.out.println("Action: "+action);
				while (cells.hasNext()) {
					params.add(cells.next().toString());
				}
				System.out.println("Cell Values "+ params);		
				// create keyword object
				Keyword keyword = (Keyword)Class.forName("Keywords."+action).newInstance();
				if(keyword.validateObject(params))
					keyword.execute(params);
			}
			wb.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			driver.close();
			driver.quit();
		}
	}
}
