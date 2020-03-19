package com.epam.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirst2AsTest {
	
	/*
	 * 1. 1st char A : ABCD => BCD - success
	 * 2. 1st 2chars A : AACD => CD - success
	 * 3. 2nd char A : BACD => BCD - success
	 * 4. no 1st A's : BBAA => BBAA - success
	 * 5. 1st last A's : AABAA => BAA - success
	 */
	
	Remove1st2AChars remove1st2achars;
	
	@BeforeEach
	void setUp() {
		remove1st2achars=new Remove1st2AChars();
	}

	@Test
	void test1stChar() {
		assertEquals("BCD",remove1st2achars.remove("ABCD"));
	}
	
	@Test
	void test1st2Chars() {
		assertEquals("CD",remove1st2achars.remove("AACD"));
	}
	
	@Test
	void test2ndChar() {
		assertEquals("BCD",remove1st2achars.remove("BACD"));
	}
	
	@Test
	void testNo1st2AChars() {
		assertEquals("BBAA",remove1st2achars.remove("BBAA"));
	}
	
	@Test
	void testChars() {
		assertEquals("BAA",remove1st2achars.remove("AABAA"));
	}

}
