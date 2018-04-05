package problem5;

import java.util.Scanner;
import java.util.Stack;

public class BusCounter {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		input.nextLine();
		
		//initiation
		char[][] schedule = new char[12][24]; // 24 jam dengan tiap jamnya dibagi menjadi 12 pembagian (1 pembagian 5 menit)
		String[] arrival = new String[2];
		String[] departure = new String[2];
		for(int x = 0; x<1;x++){
			String[] bus = input.nextLine().split(" "); // index 2 arrival index 4 departure
			arrival = bus[2].split(":");
			departure = bus[4].split(":");
			schedule[Integer.parseInt(arrival[1])][Integer.parseInt(arrival[0])] = 'A';
			schedule[Integer.parseInt(departure[1])][Integer.parseInt(departure[0])] = 'D';
		}
		
		//	SOLUTION: using stack
		Stack<Character> st = new Stack<Character>();
		for(int y = 0; y< schedule.length;y++){
			for(int x = 0; x< schedule[y].length; x++){
				
			}
		}
		
	}
}
