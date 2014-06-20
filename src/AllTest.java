import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AllTest extends TestCase {
	public static TestSuite suite()
	{
		TestSuite suite = new TestSuite();
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(CourseSessionTest.class);
		return suite;
	}		
}