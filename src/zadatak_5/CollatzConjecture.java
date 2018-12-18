package zadatak_5;

import java.util.Scanner;

public class CollatzConjecture {

	public static void main(String[] args) {
		System.out.println("Unesite pocetni broj.");
		Scanner input=new Scanner(System.in);
		int start=input.nextInt();
		int next=start;
		System.out.print(start + " ");
		input.close();

		while(next!=1) {
			if(next%2==0) {
				next/=2;
				System.out.print(next + " ");
			}

			else {
				next=(3*next)+1;
				System.out.print(next + " ");
			}

		}

	}
}
