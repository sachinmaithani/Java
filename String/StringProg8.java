package StringProg;

import java.util.Scanner;

public class StringProg8 {

	public static void main(String[] args) {
		// to check if strings are anagram
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");		
		String str1 = sc.next();
		System.out.println("Enter string:");
		String str2 = sc.next();
		int count =0;
		if(str1.length() == str2.length()) {
			for(int i=0;i<str1.length();i++) {
				if(str2.indexOf(str1.charAt(i))>=0) {
					count++;
				}
			}
			if(count == str1.length()) {
				System.out.println("Strings are anagram");
			}else {
				System.out.println("Strings are not anagram");
			}
		}else {
			System.out.println("Strings are not anagram");
		}
		

	}

}
