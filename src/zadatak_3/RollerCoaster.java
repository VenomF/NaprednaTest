package zadatak_3;

import java.util.Scanner;

public class RollerCoaster {

	public static void main(String[] args) {
		System.out.println("Unesite neku recenicu.");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String result="";
		input.close();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' ')
				result+=' ';
			else if(!Character.isLetterOrDigit(str.charAt(i)))
				result+=str.charAt(i);
			else if(i%2==0)
				result+=Character.toUpperCase(str.charAt(i));
			else
				result+=Character.toLowerCase(str.charAt(i));
		}
		
		System.out.println(result);

	}

}
