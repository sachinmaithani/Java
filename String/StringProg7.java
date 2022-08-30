package StringProg;

import java.util.Scanner;

public class StringProg7 {

	public static void main(String[] args) {
		// count number of Vowel and Consonants

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");		
		String str = sc.nextLine();
		str = str.toLowerCase();
		String alphabet ="aeioubcdfghjklmnpqrstvwxyz1234567890";
		
		int len = str.length(),count =0;
		
		for(int i=0;i<str.length();i++) {
			if( alphabet.indexOf(str.charAt(i)) >= 0 ) {
				count++;
			}
		}
		System.out.println( "No. of special characters:"+(len-count) );

	}

}
