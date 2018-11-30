package com.bridgelabz.functionalprograms;

public class SpringSeason {
  public static void main(String args[]) {
	  int m=Integer.parseInt(args[0]);
	  int d=Integer.parseInt(args[1]);
	  boolean spring=false;
	  if(m==3 && d>=20 && d<=31 || m==4 && d>=1 && d<=30 || m==5 && d>=1 && d<=31 || m==6 && d>=1 && d<=20)//checking the range of spring season
	  {
		  spring=true;
		  System.out.println(spring+" Spring Seanson is on");
	  }
	  else {
		  spring=false;
		  System.out.println(spring+" Spring Seanson is off");
	  }
  }
}
