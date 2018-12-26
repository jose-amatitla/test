package com.quizzes.starters;

class Compare12{
	public static void main(String ... args){
		int a = 012;
		int b = 12;
		int c = Integer.parseInt("012", 10);
		
		System.out.println("a == b " + (a == b));
		System.out.println("b == c " + (b == c));
		System.out.println("a == c " + (a == c)); 
	}
}