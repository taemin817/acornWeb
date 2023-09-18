package acorn;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ExTestTest2 {
	
	ExTest t = new ExTest();
	
	@Test
	void testAdd() {
		assertEquals(8, t.add(5, 3) );
//		fail("Not yet implemented");
	}

	@Test
	void testSubtract() {
		assertEquals(2, t.subtract(5, 3) );
//		fail("Not yet implemented");
	}

	@Test
	void testMultiple() {
		assertEquals(15, t.multiple(5, 3) );
//		fail("Not yet implemented");
	}

	@Test
	void testDivide() {
		assertEquals(4, t.divide(12, 3) );
//		fail("Not yet implemented");
	}
	 
	@Test
	void testYaksu() {
		
		ArrayList<Integer>  result = new ArrayList<>();
		result.add(1);
		result.add(2);
		result.add(4);
		
		assertEquals(result, t.yaksu(4));
//		fail("Not yet implemented");
	}

}
