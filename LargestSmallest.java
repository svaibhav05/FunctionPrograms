package com.bridgelabz.functionalprograms;
import java.util.*;

public class LargestSmallest {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  int n;
	  System.out.println("Enter the size of array:");
	  n=sc.nextInt();
	  int a[]=new int[n];
	  System.out.println("Enter the elements:");
	  for(int i=0;i<n;i++) {
		  a[i]=sc.nextInt();
	  }
	  for(int i=0;i<n;i++) {
		  System.out.print(a[i]+" ");
	  }
	
	  int max1=0,max2=0;
	  for(int i=0;i<n;i++) {
		  if(a[i]>max1) {
			  max2=max1;
			  max1=a[i];
		  }
		  if(a[i]>max2 && a[i]<max1) {
			  max2=a[i];
		  }
	  }
	  
	  
		int min1 = Integer.MAX_VALUE;
		
		int min2 = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ; i++) {
			if(a[i] < min1) {
				min2 = min1;
				min1 = a[i];
			}
			if(a[i] > min1 && a[i] < min2) {
				min2= a[i];
			}
		}

		System.out.println("\nSecond Largest:"+max2);
	    System.out.println("\nSecond Smallest:"+min2);
	  
	 
	 
	  
  }
}
