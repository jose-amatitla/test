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
 * Whats going to be the output of the following program ?
 */
public class InheritanceSample {
    public static void main(String ... args){
        Base b = new Derived();
        b.show();
    }
}

class Base {
    public void show(){
        System.out.println("Base::show() called");
    }
}

class Derived extends Base{
    public void show(){
        System.out.println("Derived::show() called");
    }
}