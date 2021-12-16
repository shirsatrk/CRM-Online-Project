package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import com.utils.screenCapture;
import com.utils.utilsBaseClass;

public class listener extends utilsBaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getName());
		log.info("Test with name " + result.getName() + " is started.");

	}

	public void onTestSuccess(ITestResult result) {
		log.info("Test with name " + result.getName() + " is failed.");
		test.log(Status.PASS, "Test is sucessful");

	}

	public void onTestFailure(ITestResult result) {
		log.info("Test with name " + result.getName() + " is failed.");
		test.log(Status.FAIL, "Test case is failed.");
		test.log(Status.FAIL, result.getThrowable());

		screenCapture sc = new screenCapture();
		log.info("Sceen shot of failed test case is captured.");
		test.addScreenCaptureFromPath(sc.screenShot(result.getName()));
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test is skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		test.log(Status.SKIP, "Test is FailedButWithinSuccessPercentage " + ITestResult.SUCCESS_PERCENTAGE_FAILURE);

	}

	public void onStart(ITestContext context) {
		test.log(Status.SKIP, "Test is ONSTART " + context.getName());

	}

	public void onFinish(ITestContext context) {
		log.info(context.getFailedTests());
		report.flush();

	}

}
