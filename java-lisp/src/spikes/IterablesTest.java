package spikes;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static com.google.common.collect.Iterables.*;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

public class IterablesTest {

	@Test
	public void testFilters() {
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		
		Iterable<Integer> evens = filter(numbers, new Predicate<Integer>(){
			@Override
			public boolean apply(Integer arg0) {
				return arg0 % 2 == 0;
			}
		});
		
		assertEquals(Arrays.asList(2,4), Lists.newArrayList(evens));
	}
	
	@Test
	public void testTransforms() {
		List<Integer> numbers = Arrays.asList(1,2);
		
		Iterable<String> numbersAsStrings = transform(numbers, new Function<Integer,String>(){
			@Override
			public String apply(Integer arg0) {
				return arg0.toString();
			}
		});
		
		assertEquals(Arrays.asList("1","2"), Lists.newArrayList(numbersAsStrings));
	}
	
	@Test
	public void testSkip() {
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		
		assertEquals(Arrays.asList(2,3,4), Lists.newArrayList(skip(numbers, 1)));
	}

}
