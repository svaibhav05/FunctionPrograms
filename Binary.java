package com.bridgelabz.functionalprograms;
import com.bridgelabz.Utility.*;
import java.util.*;

public class Binary {
	
      
    public static void main (String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int n=sc.nextInt();
        System.out.println("Decimal to Binary:");
		Utility.DecToBinary(n);
    	
    } 
}
