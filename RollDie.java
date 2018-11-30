package com.bridgelabz.functionalprograms;
import java.util.*;
public class RollDie {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number of rolls:");
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++) {
		 a[i]=1+(int)(Math.random()*6);
		 System.out.println(a[i]);
	 }
	 int max = 0;
	 for (int i=0;i<a.length; i++) {
	        int count = 0;
	        for (int j=0;j<a.length;j++) {
	          if (a[i]==a[j]) {
	              count++;
	          }
	    }
	   if (count >= max) {
	       max = count;
	  }   
	 }
	 System.out.println("Maximum occurrence is:"+max);
 }
}
