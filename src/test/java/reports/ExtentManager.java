package reports;

import com.relevantcodes.extentreports.ExtentReports;

//OB: ExtentReports extent instance created here. That instance can be reachable by getReporter() method.
public class ExtentManager {

  private static ExtentReports extent;

  public synchronized static ExtentReports getReporter() {
	  
	  String workingDir = System.getProperty("user.dir");
      System.out.println(" ------------> " + workingDir );
      if (extent == null) {
          //Set HTML reporting file location
         
          if (System.getProperty("os.name").toLowerCase().contains("win")) {
              extent = new ExtentReports(workingDir + "\\ExtentReports\\ExtentReportResults.html", true);
          }
          else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
              extent = new ExtentReports(workingDir + "/target/ExtentReports/ExtentReportResults.html", true);
          }
      }
      return extent;
  }
}