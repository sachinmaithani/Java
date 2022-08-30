package StringProg;

import java.util.Scanner;

public class StringProg3 {

	public static void main(String[] args) {
		
		String alp = "abcdefghijklmnopqrstuvwxyz";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check for panagram:");
		String str = sc.nextLine();
		boolean flag = false;
		for(int i=0;i<26;i++) {
			
			if(str.indexOf(alp.charAt(i)) >=0) {
				flag = true;
			}else {
				flag = false;
				System.out.println("String is not panagram");
				break;
			}
		}
		if(flag) {
			System.out.println("String is a panagam");
		}

	}

}
