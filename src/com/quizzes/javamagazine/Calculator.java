/*
 * What does the following program prints out
 * A. 121
 * B. 123
 * C. 234
 * D. 345
 * E. Three digits, but the exact values are platform-and implementation-dependent
 */
package com.quizzes.javamagazine;

/**
 *
 * @author Skywalker
 */
public class Calculator {
    public static void main(String ... args){
        int i = 0;
        
        Calculator c = new Calculator();
        System.out.print(i++ + c.operation(i));
        System.out.println(i);
    }

    private int operation(int i) {
        System.out.print(i++);
        return i;
    }
}
