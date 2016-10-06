package test;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		int count = 0;
		for (int a_i = 0; a_i < n; a_i++) {
			for (int j = a_i + 1; j < n; j++) {
				if ((a[a_i] + a[j]) % k == 0) {
					count++;
				}
			}

		}
		System.out.println(count);
		in.close();
	}
}
