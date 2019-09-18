import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class PerformanceTestDemo {

	@Test
	public void performanceTestDemo() {
		assertTimeout(Duration.ofSeconds(3),
				() -> {
					for(int i=0;i<=1000000;i++) {
						System.out.println(i); 
					}
				}
			);	
	}
	
	@Test
	public void performanceTestDemo2() {
		assertTimeout(Duration.ofSeconds(3),
				() -> {
					  // Noncompliant code: use framework like awaitility
					  Thread.sleep(100);
				}
			);	
	}

}
