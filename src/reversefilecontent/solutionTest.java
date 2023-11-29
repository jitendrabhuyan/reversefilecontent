package reversefilecontent;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class solutionTest {

	
	@Test
	void testReverseContentSingleChar() {
		solution help=new solution();

		Assert.assertArrayEquals("Single char content reverse failed", "A".toCharArray(), help.reverseContent("A").toCharArray());
	}
	
	@Test
	void testReverseContentTwoChar() {
		solution help=new solution();

		Assert.assertArrayEquals("Two char content reverse failed", "BA".toCharArray(), help.reverseContent("AB").toCharArray());
	}
	
	@Test
	void testReverseContentComplete() {
		solution help=new solution();

		Assert.assertArrayEquals("Complete content reverse failed", "DCBA".toCharArray(), help.reverseContent("ABCD").toCharArray());
	}

}
