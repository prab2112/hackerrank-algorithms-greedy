package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GreedyFlorist {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N, K;
		N = in.nextInt();
		K = in.nextInt();

		Integer C[] = new Integer[N];
		for (int i = 0; i < N; i++) {
			C[i] = in.nextInt();
		}
		Arrays.sort(C, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}

		});
		int result = 0;
		for (int i = 0; i < N; i++) {
			int left = K / i;
			result += (C[i] * (left + 1));
		}
		System.out.println(result);
	}
}
