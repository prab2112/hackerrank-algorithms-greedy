package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Order {
	public int id;
	public int data;

	public Order(int t, int data) {
		// TODO Auto-generated constructor stub
		this.id = t;
		this.data = data;
	}
}

public class JimOrders {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		Order orders[] = new Order[n];
		for (int i = 1; i <= n; i++) {
			orders[i] = new Order(i, sc.nextInt() + sc.nextInt());
		}

		Arrays.sort(orders, new Comparator<Order>() {

			@Override
			public int compare(Order a, Order b) {
				// TODO Auto-generated method stub
				return (a.data < b.data) ? -1 : (a.data > b.data) ? 1 : (a.id < b.id) ? -1 : 1;
			}
		});
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<n;i++){
			sb.append(orders[i].id).append(" ");
		}
		
		System.out.println(sb);

	}
}
