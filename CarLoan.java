package com.bridgelabz.functionalprograms;

public class CarLoan {
	
  public static void main(String args[]) {
	  
	   float P=Float.parseFloat(args[0]);
	   float Y=Float.parseFloat(args[1]);
	   float R=Float.parseFloat(args[2]);
	   
	   float n=12*Y;
	   float r=R/(12*100);
	   float m = (P*r);
	   float b = (float)(1-(Math.pow((1+r),-n)));
	   float payment = (m/b);
	   System.out.println(payment);
   }
}
