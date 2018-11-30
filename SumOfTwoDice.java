package com.bridgelabz.functionalprograms;

import com.bridgelabz.Utility.Utility;

public class SumOfTwoDice {
	    public static void main(String[] args) {
	       	int SIDES = 6;
	        int a = 1+(int) (Math.random()*SIDES);
	        System.out.println(a);
	        int b = 1+(int) (Math.random()*SIDES);
	        System.out.println(b);
	        int sum = a + b;
	        System.out.println("Sum of two random integers:"+sum);
	    }
	}



