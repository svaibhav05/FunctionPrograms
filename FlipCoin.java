package com.bridgelabz.functionalprograms;
import com.bridgelabz.Utility.*;
import java.util.Scanner;


public class FlipCoin {
	public static void main(String args[]) {
		
        Scanner in = new Scanner(System.in);
         
        System.out.println("How many times will the coin be flipped? ");
        int flips = in.nextInt();
        Utility.HeadTail(flips); 
        
	}
}
