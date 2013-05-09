package spikes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.junit.Test;


public class CollectionUtilTest {

	@Test
	public void testSelect() {
		Collection<Integer> integerList = Arrays.asList(1,2,3,4);
		
		Collection evenNumbers = CollectionUtils.select(integerList, new Predicate() {
			@Override
			public boolean evaluate(Object arg0) {
				return ((Integer)arg0) % 2 == 0;
			}  
		  });
		
		assertEquals(Arrays.asList(2,4), evenNumbers);
	}

}
