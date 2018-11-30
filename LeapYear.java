package com.bridgelabz.functionalprograms;
import com.bridgelabz.Utility.*;
import java.util.Scanner;


public class LeapYear {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter any year:");
    int year = sc.nextInt();
    Utility.Leap(year);
}
}
