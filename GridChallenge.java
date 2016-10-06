package test;

import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String str[] = new String[n];
			char ch[][] = new char[n][];
			for (int i = 0; i < n; i++) {
				str[i] = sc.next();
				ch[i] = str[i].toCharArray();
				Arrays.sort(ch[i]);
			}

			boolean isSorted = true;
			for (int x = 0; x < n; ++x) {
				for (int y = 1; y < n; ++y) {
					if (ch[y][x] < ch[y - 1][x]) {
						x = n;
						isSorted = false;
						break;
					}
				}
			}
			StringBuffer sb = new StringBuffer();
			sb.append(isSorted ? "YES" : "NO");
			System.out.println(sb.toString());
		}
	}
}
