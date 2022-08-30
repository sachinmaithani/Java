package StringProg;

import java.util.Scanner;

public class StringProg5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");		
		String str = sc.nextLine();
		char temp ;
		
		//sorting string alphabetically
		char[] ch = str.toCharArray();
		System.out.println(ch);
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		String str1 = new String(ch);
		System.out.println("sorted string:: "+ str1);
	}

}
