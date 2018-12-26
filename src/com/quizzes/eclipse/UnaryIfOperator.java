/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizzes.eclipse;

/**
 *
 * @author Skywalker
 * What´s going to be the output of this java program.
 */
public class UnaryIfOperator {
    public static void main(String ... args){
        char x = 'X';
        int i = 0;
        
        System.out.print(true ? x : 0); 
        System.out.print(false ? i : x);
    }    
}
