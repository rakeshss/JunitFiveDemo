import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class UnderstandingAnnotation {

	@BeforeEach
	public void callBeforeExecutingEachMethod() {
		System.out.println("@BeforeEach - executed before each test method.");
	}

	@BeforeAll
	public static void callBeforeExecutingAllTestMethods() {
		System.out.println("@BeforeAll - executed before all test methods.");
	}

	@Test
	public void test(TestInfo info) {
		System.out.println("some text!!" + info.getTestMethod());
	}

	@Test
	public void test1(TestInfo info) {
		System.out.println("some text!!" + info.getTestMethod());
	}
	
	@AfterEach
	public void callAfterExecutingEachMethod() {
		System.out.println("@AfterEach - executed after each test method.");
	}
	
	@AfterAll
	public static void callAfterExecutingAllTestMethods() {
		System.out.println("@AfterAll - executed after all test methods.");
	}

}
