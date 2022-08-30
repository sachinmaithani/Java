package StringProg;

import java.util.Scanner;

public class StringProg2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String s1 = sc.nextLine();
		String s2 = ""; 
		String strArr[] = s1.split(" ");
		
		System.out.println(strArr[0]);

		for(int i=0;i<strArr.length;i++) {
			s2="";
			for(int j=strArr[i].length()-1; j>=0;j--) {
				s2 = s2 + strArr[i].charAt(j);
			}
			strArr[i] = s2;
		}
		
		s2 = strArr[0];
		
		for(int i=1;i<strArr.length;i++) {
			s2= s2+" "+strArr[i];
		}
		
		System.out.println(s2);
	}

}
