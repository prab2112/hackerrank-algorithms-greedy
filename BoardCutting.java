package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BoardCutting {
	public static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int m = sc.nextInt(), n = sc.nextInt();
			Integer cy[] = new Integer[m - 1];
			Integer cx[] = new Integer[n - 1];

			for (int i = 0; i < m; i++) {
				cy[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				cx[i] = sc.nextInt();
			}

			Arrays.sort(cy, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o2 - o1;
				}
			});

			Arrays.sort(cx, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o2 - o1;
				}
			});

			int ny = 1, nx = 1;
			long cost = 0;

			while (ny < m || nx < n) {
				if (ny < m && (nx > n && cy[ny - 1] > cx[nx - 1])) {
					cost += ((long) nx * (long) cy[ny - 1] % MOD) % MOD;
					ny++;
				} else if (nx < n && (ny > m && cx[nx - 1] >= cy[ny - 1])) {
					cost += ((long) ny * (long) cx[nx - 1] % MOD) % MOD;
					nx++;
				}
			}
			
			System.out.println(cost);
		}
	}
}
