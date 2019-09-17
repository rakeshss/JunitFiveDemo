import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class UnderstandingAnnotation {

	@BeforeEach
	public void init() {
		System.out.println("@BeforeEach - executed before each test method.");
	}

	@BeforeAll
	public static void setup() {
		System.out.println("@BeforeAll - executed before all test methods.");
	}

	@Test
	public void test(TestInfo info) {
		System.out.println("some text!!" + info.getTestMethod());
	}

	@DisplayName("This help to map function name")
	@Test
	public void test1(TestInfo info) {
		System.out.println("some text!!" + info.getTestMethod());
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("@AfterEach - executed after each test method.");
	}
	
	@AfterAll
	public static void finalCleanUp() {
		System.out.println("@AfterAll - executed after all test methods.");
	}

}
