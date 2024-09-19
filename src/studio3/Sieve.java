package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please input the number n you want : ");
		int n = scan.nextInt();
				
		boolean[] primeArray = new boolean [n];
		for(int i = 2; i < n; i++) {
			for(int j = 2; j < n/i; j++) {
				primeArray[i*j] = true; 
			
		
			
			
			
			
			
			}
			if(primeArray[i]==false) {
			System.out.print(i+" ");
			

	}
		
		}
		
	}

}
//s = any number (int) >1
//i = the index of the array at that point