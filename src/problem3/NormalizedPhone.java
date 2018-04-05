package problem3;

import java.util.Scanner;

public class NormalizedPhone {

	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Phone: ");
		String phone = in.nextLine();
		System.out.print("Normalized_phone: ");
		normalized(phone);
		
	}
	// method normalized phone
	public static void normalized(String ph){
		if(ph.equalsIgnoreCase("(null)") || ph.equals("-")){
			System.out.println(ph);
		}
		else{
			String[] temp = ph.split("[^\\w']+");
			//CHECK DEPANNYA 08 
			String tempStr = "";
			for(String x: temp) tempStr+=x;
			if(tempStr.substring(0, 2).equals("08")){
				tempStr = "628"+tempStr.substring(2, tempStr.length());
			}
			System.out.println(tempStr);
		}
	}
}
