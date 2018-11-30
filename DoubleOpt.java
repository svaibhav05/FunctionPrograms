package com.bridgelabz.functionalprograms;

import java.util.Scanner;
public class DoubleOpt {
   public static void main(String args[]) {
	   double a,b,c;
	   double op1,op2,op3,op4;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter values of a, b and c:");
	   a=sc.nextDouble();
	   b=sc.nextDouble();
	   c=sc.nextDouble();
	   op1=(a+b)*c;
	   System.out.println("OP1:"+op1);
	   op2=(a*b)+c;
	   System.out.println("OP2:"+op2);
	   op3=(c+a)/b;
	   System.out.println("OP3:"+op3);
	   op4=(a%b)+c;
	   System.out.println("OP4:"+op4);
   }
}
