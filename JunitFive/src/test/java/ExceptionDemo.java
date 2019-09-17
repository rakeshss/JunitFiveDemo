import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ExceptionDemo {

	@Test
	public void length_exception() {
		String str = null;
		
		assertThrows(NullPointerException.class, 
				() -> {
						str.length();
					  }
				);
	}
}
