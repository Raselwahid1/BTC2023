package db;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

//public class BaseListener implements ITestListener {
	
	
	public class BaseListener implements ITestListener{

		public void onTestStart1(ITestResult result) {
			System.out.println(result.getName()+"");			
		}

		public void onTestSuccess1(ITestResult result) {
			
			System.out.println(result.getName() +"test2 is passed");
			
			
		}

		public void onTestFailure1(ITestResult result) {
			
			System.out.println(result.getName()+"is failed");
			System.out.println(result.getName()+"take screenshot");
			
		}

		public void onTestSkipped1(ITestResult result) {

			System.out.println(result.getName()+"skipped");
		}

		public void onTestFailedButWithinSuccessPercentage1(ITestResult result) {

			System.out.println(result.getTestName()+"is starting");
			
		}

		public void onStart1(ITestContext context) {
			
		}

		public void onFinish(ITestContext context) {
						
		}

		public void onTestStart(ITestResult result) {
						
		}

		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

		public void onFinish1(ITestContext context) {
			// TODO Auto-generated method stub
			
		}

	
	
	
	
	

}
