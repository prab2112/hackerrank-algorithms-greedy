package test;

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];

		int fa[] = new int[1001];
		int fb[] = new int[1001];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			fa[a[i]]++;
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			fb[b[i]]++;
		}
		int count = 0;
		for (int i = 0; i < fa.length; i++) {
			count += Math.min(fa[i], fb[i]);
		}
		
		System.out.println(count==n?n-1:count+1);
	}
}
