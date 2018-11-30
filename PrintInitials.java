package com.bridgelabz.functionalprograms;
import java.util.*;
public class PrintInitials {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		char x;
		int length;
		System.out.print("Enter a string: ");
		s=sc.nextLine();
		s=" "+s; 
		length=s.length();
		System.out.print("Output=");
		 
		for(int i=0;i<length;i++)
		{
		x=s.charAt(i);
		if(x==' ') {
		System.out.print(s.charAt(i+1)+" ");
		}
		}
		System.out.println();
	    int count=4;
		
		for(int i=0; i<=8;i++) {
			for(int j=0; j<2;j++) {
				System.out.print("*");
			}
			for(int k=0; k<=4; k++) {
				if(k==count) {
					System.out.print("**");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<=3) {
				count--;
			}
			else if(i<=8) {
				count++;
			}
			System.out.println(" ");
		}
		
		for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=2;j++)
		{
			System.out.print("*");
		}
		if(i==1||i==9)
		{
			System.out.print("**********");
		}
		else if(i==8||i==2)
		{
			System.out.printf("           **");
		}
		else if(i==7||i==3)
		{
			System.out.printf("            **");
		}
		else if(i==6||i==4)
		{
			System.out.printf("             **");
		}
		else if(i==5||i==6)
		{
			System.out.printf("              **");
		}
		System.out.println();
		}
	

	//else if(s=="w") {

for(int i=0;i< 9;i++)
{	
	//Print the space first 
	for(int j=0;j<=i;j++)
	{
		System.out.printf(" ");
	}
	//Print the first line of W
	for(int l=0;l<2;l++)
	{
		System.out.printf("*");
	}
	//print the Two spaces of W
	for(int k=7;k>=i;k--)
	{
		System.out.printf("  ");
	}
	//Print the second line of W
	for(int l=0;l<2;l++)
	{
		System.out.printf("*");
	}
	
	
	//Second Portion Of Character W
	for(int j=1;j<=i;j++)
	{
		System.out.printf("  ");
	}
	for(int l=0;l<2;l++)
	{
		System.out.printf("*");
	}
	for(int k=7;k>=i;k--)
	{
		System.out.printf("  ");
	}
	for(int l=0;l<2;l++)
	{
		System.out.printf("*");
	}
	System.out.printf("\n");

	}
	}	

}
	
	

   
