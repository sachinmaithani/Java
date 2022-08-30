package StringProg;

import java.util.Scanner;

public class StringProg4 {

	public static void main(String[] args) {
		//repeated character
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		String str1 = ""+str.charAt(0);
		int len = str.length();
		
		for(int i=1;i<len;i++) {
			if( str.substring(0,i).indexOf(str.charAt(i)) >=0 && str.substring(i,len).indexOf(str.charAt(i)) >=0 && str1.indexOf(str.charAt(i)) <0 ){
				str1 += str.charAt(i);
			}
		}
		System.out.println("repeated characters in a string");
		System.out.println(str1);
		

	}

}
