package test;

import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int count = 0;
			int max = 0;
			for (int i = 1; i <= n - 1; i++) {
				for (int j = i + 1; j <= n; j++) {
					int test = (i & j);
					//System.out.println(test);
					System.out.println(i + " " + j + "=" + (i & j));
					if (test < k && test > max) {
						// System.out.println(i + " " + j + "=" + (i & j));
						// count++;
						//System.out.println("In");
						max = test;
					}
				}
			}
			System.out.println(max);
			// sc.close();
		}
	}
	
	/*public static int findMaximum(int n, int k){
        int max = 0;
        int a = n - 1; // we are constrained by a < b
        while(a-- > 0) {
            for(int b = a + 1; b <= n; b++){
                int test = a & b;
                System.out.println(a + " " + b + "=" + (a & b));
                if( 	test < k 
                	&& 	test > max ){
                    max = test;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println( findMaximum(n, k) );
        }
        in.close();
    }*/
}
