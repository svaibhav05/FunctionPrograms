package com.bridgelabz.functionalprograms;

import java.util.Scanner;
public class IntOpt {
   public static void main(String args[]) {
	   int a,b,c;
	   int op1,op2,op3,op4;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter values of a, b and c:");
	   a=sc.nextInt();
	   b=sc.nextInt();
	   c=sc.nextInt();
	   op1=(a+b)*c;
	   System.out.println("OPERATION 1:"+op1);
	   op2=(a*b)+c;
	   System.out.println("OPERATION 2:"+op2);
	   op3=(c+a)/b;
	   System.out.println("OPERATION 3:"+op3);
	   op4=(a%b)+c;
	   System.out.println("OPERATION 4:"+op4);
   }
}
