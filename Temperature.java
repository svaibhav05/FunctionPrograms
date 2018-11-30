package com.bridgelabz.functionalprograms;
import com.bridgelabz.Utility.*;
import java.util.*;
class Temperature {
	
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the temperature in Celcius:");
	   double c=sc.nextDouble();
	   System.out.println("Enter the temperature in Fahrenheit:");
	   double f=sc.nextDouble();
	   System.out.println("Celsius to Fahrenheit:");
	   Utility.CelciusToFahrenheit(c);
	   System.out.println("Fahrenheit to Celcius:");
	   Utility.FahrenheitToCelcius(f);
	   
   }
}
