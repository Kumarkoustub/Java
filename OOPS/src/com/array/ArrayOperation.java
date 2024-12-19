package com.array;

public class ArrayOperation extends ArrayDefination {
	public void insertValueAtIndex(int[] array, int value, int index) {
		int temp = 0;
		for (int i = index; i < array.length; i++) {
			temp = array[i];
			array[i] = value;
			value = temp;
		}
	}

	public boolean duplicate(int array[], int value) {
		boolean isDublicate = false;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				count = count + 1;
			}

		}
		if (count > 1) {

			isDublicate = true;
		}
		System.out.println("Count is: " + count);

		return isDublicate;

	}

}
