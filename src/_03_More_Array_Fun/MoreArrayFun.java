package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] list = { "a", "u", "bamprfasdf", "power", "armor" };
		MoreArrayFun a = new MoreArrayFun();
		 a.arrayPrinter(list);
		 System.out.println("\n");
		 a.arrayPrinterReverse(list);
		 System.out.println("\n");
		 a.arrayPrinterEveryOther(list);
		 System.out.println("\n");
		a.arrayPrinterRandom(list);

	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void arrayPrinter(String[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void arrayPrinterReverse(String[] list) {
		for (int i = 0; i < list.length; i++) {
			int a = list.length - 1 - i;
			System.out.println(list[a]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	void arrayPrinterEveryOther(String[] list) {
		boolean odd = true;
		if (odd == false) {
			for (int i = 0; i < list.length; i++) {
				if (i % 2 != 0) {
					System.out.println(list[i]);
				} else {
				}
			}
		}
		if (odd) {
			for (int i = 0; i < list.length; i++) {
				if (i % 2 == 0) {
					System.out.println(list[i]);
				} else {
				}
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	void arrayPrinterRandom(String[] list) {
		String[] antiTwin = new String[list.length];
		int wordsPrinted = 0;
		Random random = new Random();
		int i = 0;
	
		while (wordsPrinted < list.length) {	
			boolean f = true;
			i = random.nextInt(list.length);
			for (int j = 0; j < wordsPrinted; j++) {

				if (antiTwin[j].equals(list[i])) {
					f = false;
					break;
				}

			}
			if (f == true) {
				System.out.println(list[i]);
				antiTwin[wordsPrinted] = list[i];
				wordsPrinted = wordsPrinted + 1;
			}
		}
	}
}