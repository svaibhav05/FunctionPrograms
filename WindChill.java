package com.bridgelabz.functionalprograms;
import com.bridgelabz.Utility.*;

public class WindChill {
    public static void main(String args[]) {
    	  double t,v;
    	  t=Double.parseDouble(args[0]);
    	  v=Double.parseDouble(args[1]);
    	  
    	  System.out.println("Enter the temperature:");
    	  System.out.println(t);
    	  System.out.println("Enter the wind speed:");
    	  System.out.println(v);
    	  Utility.WindChill(t,v);
    }
}
