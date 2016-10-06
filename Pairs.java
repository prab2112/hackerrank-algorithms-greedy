package test;

import java.util.Arrays;

public class Pairs {
	public static void main(String[] args) {
		
	}
	
	static int pairs(int[] a,int k) {
	      /* Complete this function */
	        Arrays.sort(a);
	        int i=0,j=1,count=0;
	    
	        while(j < a.length) {
	        int diff = a[j] - a[i];
	        
	        if (diff == k) {
	            count++;
	            j++;
	        } else if (diff > k) {
	            i++;
	        } else if (diff < k) {
	            j++;
	        }
	    }
	        return count;
	        
	        
	    }
}
