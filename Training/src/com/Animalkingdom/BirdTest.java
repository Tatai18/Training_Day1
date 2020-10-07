package com.Animalkingdom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BirdTest {

	@Test
	void test() {
		Bird b=new Bird();
		String s=b.Eat();
		assertEquals("Inside Bird.Eat()",s);
	}

}
