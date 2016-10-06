package test;

import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // convert to binary and split into strings of consecutive ones
        String[] groupings = Integer.toBinaryString(n).split("0");
        int max = 0;
        for(String s : groupings){
        	System.out.println(s);
            if(max < s.length()){
                max = s.length();
            }
        }
        System.out.println(max);
	}
}
