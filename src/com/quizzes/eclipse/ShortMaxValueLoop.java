/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizzes.eclipse;

/**
 *
 * @author Skywalker
 * 
 * What will be written to console if you run
 * the following Java program ?
 */
public class ShortMaxValueLoop {
   public static void main(String ... args){
       short start = Short.MAX_VALUE - 10;
       short end = Short.MAX_VALUE;
       int n = 0;
              
       for(short i = start; i <= end; i++){
           n++;           
       }
       
       System.out.println(n);       
   } 
}
