import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class RepetationDemo {

	@Test
	@DisplayName("Repeat string length calculation for five times")
	@RepeatedTest(5)
	public void length_exception() {
		String str = "Rakesh";
		assertThat(str,containsString("esh")); 
	}
}
