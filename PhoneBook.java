package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> phonebook = new HashMap<>();
		int n = sc.nextInt();
		while (n-- > 0) {
			//String str[] = br.readLine().split(" ");
			String name = sc.next();
			String phone = sc.next();
			phonebook.put(name, phone);
		}
		while(sc.hasNext()){
			String s = sc.next();
			if(phonebook.containsKey(s)){
				System.out.println(s +"="+phonebook.get(s));
			}else{
				System.out.println("Not found");
			}
		}
		
		
		
	}
}
