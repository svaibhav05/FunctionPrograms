package com.bridgelabz.functionalprograms;


public class Stats5 {
	public static void Range(double min, double max){
		double values[]=new double[5];
		System.out.println("Five random values between 0 and 1:");
		  for(int i=0;i<values.length;i++) {
	    double x = (Math.random()*((max-min)))+min;
           values[i]=x;
           System.out.println(values[i]);
		  }  
		 double average,sum=0;
		 for(int i=0;i<values.length;i++) {
			 sum=sum+values[i];
		 }
		 average=sum/5;
		 System.out.println("Average:"+average);
		 double minnum=1,maxnum=0;
		 for(int i=0;i<values.length;i++) {
			 if(values[i]>maxnum){
				 maxnum=values[i];
			 }
		
			 if(values[i]<minnum){
				 minnum=values[i];
			 }
		 }
		System.out.println("Maximum number:"+maxnum);
		System.out.println("Minimum number:"+minnum);
		 
	}
  public static void main(String args[]) {
	 
	 Stats5.Range(0,1);
	 
  }
}
