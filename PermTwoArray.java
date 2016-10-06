package test;

import java.util.Arrays;
import java.util.Scanner;

public class PermTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while (q-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}

			Arrays.sort(a);
			Arrays.sort(b);
			String str = "YES";
			for (int i = 0; i < n; i++) {
				if (a[i] + b[n - i - 1] != k) {
					str = "NO";
					break;
				}
			}
			System.out.println(str);
		}
	}
}
