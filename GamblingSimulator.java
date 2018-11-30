package com.bridgelabz.functionalprograms;
import com.bridgelabz.Utility.*;
import java.util.Scanner;



public class GamblingSimulator {
	public static void main(String args[]) {
		
		int stake=0;
        int goal=0;
        int trials;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stake,goal and trials:");
        stake=sc.nextInt();
        goal=sc.nextInt();
        trials=sc.nextInt();
        Utility.Gambler(stake,goal,trials);
}
}
