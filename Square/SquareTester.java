/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 * @(#)SquareTester.java
 *
 * SquareTester application
 *
 * @author Ramya Nagapudi
 * @version 1.00 2017/2/12
 */
 
public class SquareTester {
    
    public static void main(String[] args) {
    	
    	Square sq = new Square(10, 20, 30);
    	System.out.println(sq);
    	System.out.println("Expected: Square[x=-5,y=5,width=30,height=30]");	
    	System.out.println("Area: " + sq.getArea());
    	System.out.println("Expected: 900");
    }
}