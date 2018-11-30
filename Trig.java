package com.bridgelabz.functionalprograms;
import java.lang.*;
import java.util.*;

public class Trig {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the value in degrees:");
    	 double a=sc.nextDouble();
    	 
    	 a=Math.toRadians(a);
    	 
         System.out.println("sin(" + a + ")=" + Math.sin(a));
         System.out.println("cos(" + a + ")=" + Math.cos(a));
     }
}
