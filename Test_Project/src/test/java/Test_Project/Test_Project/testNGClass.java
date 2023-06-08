package Test_Project.Test_Project;

import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

public class testNGClass {

	public static void main(String[] args) {
		
		 TestListenerAdapter tla = new TestListenerAdapter();
		    TestNG testng = new TestNG();
		    List<String> suites = Lists.newArrayList();
		    suites.add("D:\\New folder\\Automation_Selenium IDE\\IGiS Automation\\automation\\Meghal.xml\\master_meghal.xml");//path to xml..
		    testng.setTestSuites(suites);
		//testng.setTestClasses(new Class[] { test_start.class });
		testng.addListener(tla);
		testng.run();
	}
}
