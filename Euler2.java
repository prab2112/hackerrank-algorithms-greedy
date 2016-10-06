package test;

import java.util.Scanner;

public class Euler2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			long n = sc.nextLong();
			if(isPrime(n))
				System.out.println(n);
			else{
				for (int i = 2; i <= (int) Math.sqrt(n); i = i + 1) {
					if (n % i == 0) {
						 System.out.println(n/i);
						break;
					}
				}
			}
		}
	}

	public static boolean isPrime(long a) {
		boolean isPrime = true;
		if (a == 1)
			isPrime = false;
		for (int i = 2; i <= (int) Math.sqrt(a); i = i + 1) {
			if (a % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
