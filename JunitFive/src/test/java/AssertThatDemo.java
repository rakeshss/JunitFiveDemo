import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertThatDemo {

	@Test
	public void assertThatDemo() {
		assertThat("ABC", is(not(equalTo("XYZ"))));
		assertThat("ABC", is((equalTo("ABC"))));
		
	}

}
