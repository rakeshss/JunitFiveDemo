import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class NestedAnnotationDemo {

	@Test
	void someTest() {
		assertThat("ABC", is("ABC"));
	}
	
	@Nested
	
	public class EmptyStringTest{
		
		String testData;
		
		@BeforeEach
		void setToEmpty() {
			testData = "";
		}
		
		@Test
		void lengthIsZero() {
			assertThat(testData, is(equalTo("")));
		}
		
		@Test
		void upperCaseIsAlsoZero() {
			assertThat(testData.toUpperCase(), is(equalTo("")));
		}
	}

}
