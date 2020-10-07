package com.Animalkingdom;

public class Bird implements Animal {

	@Override
	public String Eat() {
		// TODO Auto-generated method stub
		String s="Inside Bird.Eat()";
		return s;
	}

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.print("Inside Bird.Sound()");
	}

}
