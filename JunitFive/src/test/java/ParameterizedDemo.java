import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ParameterizedDemo {

	@Test
	public void testLengthOfString() {
		assertTrue("ABCD".length()>0);
		assertTrue("AB".length()>0);
		assertTrue("ABC".length()>0);
		assertTrue("xyz".length()>0);
		assertTrue("ANKJKB".length()>0);
	}
	
   @ParameterizedTest
   @ValueSource(strings= {"ABCD","AB","ABC"})
   public void testLengthOfString_using_parameterized(String str) {
		assertTrue(str.length()>0);
	}
}













































































































//assertThat("Rakesh".length(), greaterThan(0));
