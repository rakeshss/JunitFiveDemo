import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Every.everyItem;

import java.util.Arrays;
import java.util.List;

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
	
	@Test
	public void someMoreExamples() {
	    List<Integer> list = Arrays.asList(5, 2, 4);
	    
	    assertThat(list, hasSize(3));
	    assertThat(list, contains(5, 2, 4));
        //assertThat(list, everyItem(greaterThan(1)));
	}
	
}
