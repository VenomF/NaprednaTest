package zadatak_2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int odabir=0;
		
		System.out.println("Unesi broj clanova niza");
		int num=input.nextInt();
		int[] arr=new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=input.nextInt();
		}
		
		MyArray array=new MyArray(arr);
		
		
		while(odabir!=5) {
			System.out.println("Odaberi opciju:");
			System.out.println("1. najveci clan niza\n2. najmanji clan niza\n3. sumu svih elemenata niza\n4. ispisi niz");
			odabir=input.nextInt();
			
			switch (odabir) {
			case 1 : System.out.println("Najmanji element je:" + array.getSmallestElement()); break;
			case 2 : System.out.println("Najveci element je: " + array.getLargestElement()); break;
			case 3 : System.out.println("Suma svih elemenata je: " + array.sumAllElements()); break;
			case 4 : array.printAllElements(); break;
			}
			
		}
		
		input.close();

	}

}
