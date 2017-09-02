package hellodear01;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestngLearning implements ITestListener {
	@BeforeSuite
	public void beforesuite(){
		System.out.println("This is before suite");
	}
	@AfterSuite
	public void Aftersuite(){
		System.out.println("This is After suite");
	}
	
	@BeforeTest
	public void beforetest(){
		System.out.println("This is before Test");
	}
	@AfterTest
	public void Aftertest(){
		System.out.println("This is After Test");
	}
	
	@BeforeClass
	public void Beforeclass(){
		System.out.println("This is before class");
	}
	
	@AfterClass
	public void Afterclass(){
		System.out.println("This is After class");
	}
	@BeforeMethod
	public void beforemethod(){
		System.out.println("This is before Method");
	}
	
	@AfterMethod
	public void Aftermetod(){
		System.out.println("This is After Method");
	}
	
	@Test(description="Functional Test",groups="Functional",priority=0,invocationCount=2,invocationTimeOut=2)
	    public void Hit(){
		System.out.println("This is first Method");
		
	}
	
	@Test(description="Functional Test",groups="Regression",priority=1)
    public void Fit(){
	System.out.println("This is Second Method");
	
}
	@Test(description="Functional Test",groups="sanity",priority=2,alwaysRun=true)
    public void Kit(){
	System.out.println("This is Third Method");
	
			
	}
	@Test(groups={"Functional","sanity"})
	public void spit(){
		System.out.println("This is Fourth method");
	
}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
  