package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter values of a,b and c");
	   double a=sc.nextDouble();
	   double b=sc.nextDouble();
	   double c=sc.nextDouble();
	   System.out.println("Roots of x:");
	   double delta;
	   double root1,root2;
	   delta=(b*b)-(4*a*c);
	   root1=(-b+Math.sqrt(delta))/(2*a);
	   root2=(-b-Math.sqrt(delta))/(2*a);
	   System.out.println("Root1:"+root1);
	   System.out.println("Root2:"+root2);
   }
}