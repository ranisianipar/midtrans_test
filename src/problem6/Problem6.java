package problem6;

import java.util.Scanner;

public class Problem6 {
	public static int[] arr = new int[52];
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("String1: ");
		String str = in.nextLine();
		arrayInit(str);
		System.out.println("String2: ");
		str = in.nextLine();
		System.out.println(counter(str));
		
	}
	public static int index(char x){
		if((int)x > 90)return 97;
		return 65;
	}
	public static void arrayInit(String str){
		for(int x = 0; x<str.length();x++){
			arr[(int) str.charAt(x)- index(str.charAt(x))]++;
		}
		System.out.println(arr[0]);
	}
	public static int counter(String str){
		int temp = 0;
		int startIndex = 0;
		for(int x = 0; x<str.length();x++){
			// ngecek dia udah pernah dimasukkin
			startIndex = index(str.charAt(x));
			if(arr[(int) str.charAt(x)-startIndex]!=0) arr[(int) str.charAt(x)-startIndex] = arr[(int) str.charAt(x)-startIndex]-1;
			else arr[(int) str.charAt(x)-startIndex]++;
		}
		for(int x = 0; x<arr.length;x++){
			temp = temp+arr[x];
		}
		return temp;
	}
}
