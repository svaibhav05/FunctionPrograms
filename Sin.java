package com.bridgelabz.functionalprograms;
import com.bridgelabz.Utility.*;
import java.util.*;

public class Sin {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the angle in degrees:");//taking inputs for angle in degrees and no. of terms
	  double x=sc.nextDouble();
	  System.out.println("Enter the number of terms:");
	  int N=sc.nextInt();
	  x=x%(2*Math.PI);//­ Convert angle x to an angle between ­2 PI and 2 PI
	  double sinx=0;
	  for(int i=1;i<=N;i+=4) {
		  sinx+=(Math.pow(x,i))/(Utility.Factorial(i));
	  }
	  for(int i=3;i<=N;i+=4) {
		  sinx-=(Math.pow(x,i))/(Utility.Factorial(i));
	  }
	  System.out.println(sinx);
  }
}
