package _00_IntroToArrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _00_ArrayCheatSheet {

	public static void main(String[] args) {
		Random helper = new Random();
		int lowNum =200;
		int highNum = 0;
		String[] list = {"1","2","3","4","5"};
		//1. make an array of 5 Strings
		System.out.println(list[2]);
		//2. print the third element in the array
		list[2]="3 is correct!";
		//3. set the third element to a different value
		System.out.println(list[2]);
		//4. print the third element again
		for (int i = 0; i < list.length; i++) {
			
		}
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < list.length; i++) {
			list[i]="Ha your changed!!!";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		//7. make an array of 50 integers
		int[] lotOfInts = new int[50];
		
		//8. use a for loop to make every value of the integer array a random number
			for (int i = 0; i < lotOfInts.length; i++) {
				lotOfInts[i]= helper.nextInt(200);
			}
		//9. without printing the entire array, print only the smallest number on the array
			for (int i = 0; i < lotOfInts.length; i++) {
				
				if(lotOfInts[i] <= lowNum) {
					lowNum=lotOfInts[i];
				}
				
			}
System.out.println(lowNum);
		//10 print the entire array to see if step 8 was correct
for (int i = 0; i < lotOfInts.length; i++) {
	System.out.println(lotOfInts[i]);
}
		//11. print the largest number in the array.
for (int i = 0; i < lotOfInts.length; i++) {
	
	if(lotOfInts[i] >= highNum) {
		highNum=lotOfInts[i];
	}
	
}
System.out.println(highNum);
		//12. print only the last element in the array
System.out.println(lotOfInts[49]);
		
	}
}
