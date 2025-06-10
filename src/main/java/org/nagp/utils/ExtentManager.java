package org.nagp.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

  public static ExtentReports extentReports;
  public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

  public static void initReport(){
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
    sparkReporter.config().setReportName("NAGP BiAnnual Report");
    sparkReporter.config().setDocumentTitle("Devops Demo");

    extentReports = new ExtentReports();
    extentReports.attachReporter(sparkReporter);

  }

  public static void startTest(String testCaseName){
    ExtentTest extentTest = extentReports.createTest(testCaseName);
    test.set(extentTest);
  }

  public static void flush(){
    extentReports.flush();
  }

  public static void log(Status status, String message){
    test.get().log(status,message);
  }

}
