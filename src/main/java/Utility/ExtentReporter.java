package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
public static ExtentReports generateExtentReport() {
		
		ExtentReports extentReport = new ExtentReports();
		
		File extentReportFile = new File(System.getProperty("user.dir")+"/test-output/ExtentReports/extentReport.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("Cineverse");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		
		extentReport.attachReporter(sparkReporter);
		
		Properties configProp = new Properties();
		File configPropFile = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\cineverseProperties\\prop.cineverse");
		
		try {
			FileInputStream fisConfigprop = new FileInputStream(configPropFile);
			configProp.load(fisConfigprop);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		extentReport.setSystemInfo("Application URL", configProp.getProperty("URL"));
		extentReport.setSystemInfo("Browser Name", configProp.getProperty("browser"));
		//extentReport.setSystemInfo("API key", configProp.getProperty("APIkey"));
	//	extentReport.setSystemInfo("API Token", configProp.getProperty("APIToken"));
	//	extentReport.setSystemInfo("User name", System.getProperty("user.name"));
		extentReport.setSystemInfo("User Language", System.getProperty("user.language"));
		extentReport.setSystemInfo("User Country", System.getProperty("user.country"));
		extentReport.setSystemInfo("Operting System", System.getProperty("os.name"));
		extentReport.setSystemInfo("Java Version", System.getProperty("java.version"));
		
		
		return extentReport;
}
}
