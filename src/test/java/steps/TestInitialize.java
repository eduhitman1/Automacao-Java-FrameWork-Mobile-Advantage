package steps;

import java.io.IOException;

import com.edsoft.framework.base.mobile.FrameworkInitialize;
import com.edsoft.framework.configs.ConfigReader;
import com.edsoft.framework.configs.Settings;
import com.edsoft.framework.utilities.DatabaseUtil;
import com.edsoft.framework.utilities.ExcelUtil;
import com.edsoft.framework.utilities.LogUtil;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class TestInitialize extends FrameworkInitialize {

	@Before
	public void Initialize(Scenario scenario) throws IOException, ClassNotFoundException {
         // Insert the scenario name
//		ExtentReport.startScenario(scenario.getName());
		
		// Initilialize Config
		ConfigReader.PopulateSettings();
		// Logging
		Settings.Logs = new LogUtil();
		Settings.Logs.CreateLogFile();
		Settings.Logs.Write("Framework Initialize");
		
		// Create teste database
		Settings.Logs.Write("Conect ao database");
		Settings.AUTConnection = DatabaseUtil.Open(Settings.AUTConnectionString);
		DatabaseUtil.ExecuteQuery("select * from advantage", Settings.AUTConnection);

		// Browser initiliazer
//		Settings.Logs.Write("Browser Initiliazer");
//		initializeBrowser(Settings.BrowserType);
//		Settings.Logs.Write("Navegated to URL " + Settings.AUT);
//		DriverContext.Browser.Maximize().GoToUrl(Settings.AUT);
		// ExcelSheetPath
		try {
			ExcelUtil util = new ExcelUtil(Settings.ExcelSheetPath);
		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
	}
	
}
