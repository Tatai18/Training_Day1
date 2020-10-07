package com.Animalkingdom;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HerbivoreTest {

	@Test
	void test() {
		
		Animal deer=new Herbivore();
		String output=deer.Eat();
		assertEquals("Plant",output);
	}

}
