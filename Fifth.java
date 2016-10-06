package test;

import java.util.Scanner;

public class Fifth {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		char ch[] = s.toCharArray();
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
				if ((ch[i] >= 'A' && ch[i] <= 'Z')) {
					ch[i] = (char) ('A' + (ch[i] - 'A' + k) % 26);
				} else {
					ch[i] = (char) ('a' + (ch[i] - 'a' + k) % 26);
				}

			}
		}
		for(char c:ch)
		System.out.print(c);
		System.out.println();
	}
}
