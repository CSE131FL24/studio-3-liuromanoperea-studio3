package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please input the number n you want : ");
		int n = scan.nextInt();
				
		int[] numberArray  = new int[n];
		for(int i = 1; i < numberArray.length; i++) {
			numberArray[i] = n -(n-i);
			System.out.print(numberArray[i]);
		}
		
		
	}

}
