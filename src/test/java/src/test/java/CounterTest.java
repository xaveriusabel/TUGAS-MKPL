package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class CounterTest {

	@Test
	public void testReset() {
		Counter testCounter = new Counter();
		
		for(int i = 0; i < 10; i++) {
			testCounter.increment();
		}
		
		testCounter.reset();
		
		assertEquals(0, testCounter.getCount());
	}

	@Test
	public void testIncrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i < 10; i++) {
			testCounter.increment();
			assertEquals(i, testCounter.getCount());
		}
	}

	@Test
	public void testDecrement() {
		Counter testCounter = new Counter();
		
		for(int i = 1; i < 10; i++) {
			testCounter.decrement();
			assertEquals(i * -1, testCounter.getCount());
		}
	}

}
