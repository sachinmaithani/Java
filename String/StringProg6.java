package StringProg;

import java.util.Scanner;

public class StringProg6 {

	public static void main(String[] args) {
		// count number of Vowel and Consonants

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");		
		String str = sc.nextLine();
		String vowel ="aeiou", consonant = "bcdfghjklmnpqrstvwxyz";
		
		int count1 =0,count2=0;
		
		for(int i=0;i<str.length();i++) {
			if(vowel.indexOf(str.charAt(i)) >=0) {
				count1++;
			}
			if(consonant.indexOf(str.charAt(i)) >=0) {
				count2++;
			}
		}
		System.out.println("No. of vowel:"+count1+"  No. of consonant:"+count2);
	}
}
