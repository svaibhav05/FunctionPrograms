package com.bridgelabz.functionalprograms;
import java.util.*;

public class PrintThreeNames {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	String s[]=new String[3];
    	System.out.println("Enter first name:");
    	String fname=sc.nextLine();
    	System.out.println("Enter second name:");
    	String sname=sc.nextLine();
    	System.out.println("Enter third name:");
    	String tname=sc.nextLine();
        s[0]=fname;
        s[1]=sname;
        s[2]=tname;
    	for(int i=0;i<s.length;i++) {
    		System.out.println(s[i]);
    	}
    	String temp[]=new String[3];
    	int j=0;
    	for(int i=s.length-1;i>=0;i--) {
    		//System.out.println(s[i]);
    		while(j<3) {
    		   temp[j]=s[i];
    		   //System.out.println(temp[j]);
    		   j++;
    		   i--;
    		}
   
    		    
    	}
    	 System.out.println("Hi "+temp[0]+","+temp[1]+","+temp[2]);
    }
}
