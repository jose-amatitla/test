/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizzes.eclipse;

/**
 *
 * @author Skywalker
 */
public class OverridingMethod {
    public void greet(Integer i){
        System.out.println("Hi");
    }
    
    public void greet(int i){
        System.out.println("Hello");
    }
    
    public static void main(String  ... args){
        new OverridingMethod().greet(null);
    }
}
