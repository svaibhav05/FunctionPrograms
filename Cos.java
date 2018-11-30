package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Cos {
	public static int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		else return n*factorial(n-1);
	}
	public static void main(String args[]) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the angle in degrees:");
		  double x=sc.nextDouble();
		  System.out.println("Enter the number of terms:");
		  int N=sc.nextInt();
		  x=x%(2*Math.PI);
		  double cosx=0;
		  for (int i=2;i<=N;i+=4)
	        {	           
	            cosx-=1-(Math.pow(x,i))/(factorial(i));   
	       }

	        for (int i=4;i<=N;i+=4)
		 	  {
	            cosx+=(Math.pow(x,i))/(factorial(i));
	            
	            }
	        System.out.println(cosx);
	        }
}
