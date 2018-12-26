package com.quizzes.starters;

public class PolymorphismChallenge{
	static abstract class Simpson{
		void talk(){
			System.out.println("Simpson!");
		}
	}
	
	static class Homer extends Simpson{
		void talk(){
			System.out.println("Spider Piag !");
		}
	}
	
	static class Bart extends Simpson{
		protected void talk(){
			System.out.println("Eat my shorts!");
		}
	}
	
	static class Maggie extends Simpson{
	}
	
	public static void main(String ... args){
		// Display
		// Spider Pig!
		// Eat my Shorts!
		// Simpson!
		
		// Oprion A
		/*new Homer().talk();
		Simpson simpson = new Bart();
		simpson.talk();
		new Maggie().talk();*/
		
		//Option B
		/*Simpson homerSimpson = new Homer();
		Simpson bartSimpson = new Bart();
		Simpson maggieSimpson = new Maggie();
		
		homerSimpson = bartSimpson;
		
		homerSimpson.talk();
		bartSimpson.talk();
		maggieSimpson.talk();*/
		
		//Option C
		Simpson homerSimpson = new Homer();
		Simpson bartSimpson = new Bart();
		Simpson maggieSimpson = new Maggie();		
		
		homerSimpson.talk();
		bartSimpson.talk();
		maggieSimpson.talk();
		
		//Option D
		/*new Homer().talk();
		new Bart().talk();
		new Maggie().talk();	*/
	}
	
}