package com.quizzes.starters;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SortComparableChallenge{
	public static void main(String ... doYourBest){
		Set set = new TreeSet<>();
		set.add(new Simpson("Homer"));
		set.add(new Simpson("Marge"));
		set.add(new Simpson("Lisa"));
		set.add(new Simpson("Bart"));
		set.add(new Simpson("Maggie"));
		
		System.out.println("Printing the set content :");
		for(Iterator it = set.iterator(); it.hasNext(); ){
			System.out.println(it.next());
		}
			
		System.out.println("Compare 2 strings");
		String h = "Homer";
		String b = "Bart";
		String li = "Lisa";
		String mg = "Maggie";
		String mr = "Marge";
		
		System.out.println("b.compareTo(h) -> " + b.compareTo(h));
		System.out.println("b.compareTo(li) -> " + b.compareTo(li));
		System.out.println("b.compareTo(mg) -> " + b.compareTo(mg));
		System.out.println("b.compareTo(mr) -> " + b.compareTo(mr));
		System.out.println("------------------");
		
		
		//Using arrays
		System.out.println("Using simple list and sorting it");
		//List l = Arrays.asList("Homer","Marge","Lisa","Bart","Maggie");
		List l = new ArrayList<>();
		l.add(new Simpson("Homer"));
		l.add(new Simpson("Marge"));
		l.add(new Simpson("Lisa"));
		l.add(new Simpson("Bart"));
		l.add(new Simpson("Maggie"));
		Collections.sort(l);
		l.forEach(System.out::println);
		System.out.println("----------------");
		
		//Which options are  valid for below output
		//Bart
		//Homer
		//Lisa
		//Maggie
		//Marge
		
		
		//Option 1
		/*List list = new ArrayList<>();
		list.addAll(set);
		Collections.reverse(list);
		Collections.sort(list);
		list.forEach(System.out::println);*/
		
		//Option 2
		/*List list = new ArrayList<>();
		list.addAll(set);
		Collections.reverse(list);
		Collections.reverse(list);
		Collections.reverse(list);
		list.forEach(System.out::println);*/
		
		//Option 3
		/*List list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list);
		list.forEach(System.out::println);*/
		
		
		//Option 4
		List list = new ArrayList<>();
		list.addAll(set);
		Collections.reverse(list);
		list.forEach(System.out::println);
	}
	
	static class Simpson implements Comparable<Simpson>{
		String name;
		
		public Simpson(String name){
			this.name = name;
		}
		
		public int compareTo(Simpson simpson){
			return simpson.name.compareTo(this.name);
		}
		
		public String toString(){
			return this.name;
		}
	}
}