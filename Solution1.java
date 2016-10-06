package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Luck {
	private int luck;
	private int imp;

	public Luck(int luck, int imp) {
		// TODO Auto-generated constructor stub
		this.luck = luck;
		this.imp = imp;
	}

	public Luck() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return luck + " " + imp;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getImp() {
		return imp;
	}

	public void setImp(int imp) {
		this.imp = imp;
	}

}

class ImpComparator implements Comparator<Luck> {

	@Override
	public int compare(Luck o1, Luck o2) {
		// TODO Auto-generated method stub
		if (o1.getImp() == o2.getImp())
			return o2.getLuck() - o1.getLuck();
		else
			return o1.getImp() - o2.getImp();
	}

}

public class Solution1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Luck l[] = new Luck[n];
		ArrayList<Luck> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			l[i] = new Luck(sc.nextInt(), sc.nextInt());
			list.add(l[i]);
		}

		Collections.sort(list, new ImpComparator());
		// System.out.println(list);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (list.get(i).getImp() == 1) {
				if (k != 0) {
					sum += list.get(i).getLuck();
					k--;
				} else
					sum -= list.get(i).getLuck();
			} else {
				sum += list.get(i).getLuck();
			}

		}

		System.out.println(sum);
		sc.close();

	}
}
