package com.quizzes.starters;

class Test{
	public static void print(){
		System.out.println("Hello!");
	}
}

public class Main{
	public static void main(String... args){
		execute(null);
	}
	
	public static void execute(Test obj){
		obj.print();
	}
}