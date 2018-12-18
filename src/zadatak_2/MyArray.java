package zadatak_2;

import java.util.Arrays;

public class MyArray {
	
	private int[] array;
	
	public MyArray(int [] array) {
		this.array=array;
		Arrays.sort(this.array);
	}
	
	public int getSmallestElement() {
		return array[0];
	}
	
	public int getLargestElement() {
		return array[array.length-1];
	}
	
	public int sumAllElements() {
		int sum=0;
		
		for(int i=0; i<array.length; i++)
			sum+=array[i];
		
		return sum;
	}
	
	public void printAllElements() {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
			if(i%10==0)
				System.out.println();
		}
		System.out.println();
	}

}
