package org.nagp.listeners;

import com.aventstack.extentreports.Status;
import org.nagp.utils.ExtentManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener implements ITestListener {
  @Override
  public void onTestStart(ITestResult result) {
    ExtentManager.startTest(result.getMethod().getMethodName()+"    Test case started");
  }


  @Override
  public void onTestSuccess(ITestResult result) {
    ExtentManager.log(Status.PASS, "Test Case passed");
  }


  @Override
  public void onTestFailure(ITestResult result) {
    ExtentManager.log(Status.FAIL,"Test Case failed");
  }

  @Override
  public void onTestSkipped(ITestResult result) {
    ExtentManager.log(Status.SKIP,"Test Case skipped");

  }



  @Override
  public void onStart(ITestContext context) {
    ExtentManager.initReport();
  }

  @Override
  public void onFinish(ITestContext context) {
   ExtentManager.flush();
  }

}
