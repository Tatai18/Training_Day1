package com.Animalkingdom;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal deer=new Herbivore();
		System.out.println(deer.Eat());
		
		Animal lion =new Carnivore();
		System.out.println(lion.Eat());
		
		Mammals m=new Mammals();
		System.out.println(m.Eat());
		
			

	}

}
