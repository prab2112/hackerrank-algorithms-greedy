package test;

import java.util.Arrays;
import java.util.Scanner;

public class PriyankaToys {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		// int w = 4;
		int count = 1;
		int a = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > a + 4) {
				count++;
				a = arr[i];
			}
		}

		System.out.println(count);

	}
}
