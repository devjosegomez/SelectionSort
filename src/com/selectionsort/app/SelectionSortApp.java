package com.selectionsort.app;

public class SelectionSortApp {

	 public static void main(String[] args) {
		 	
		 //Declared array
		 int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		 
		 System.out.println("+++ Selection sort +++");
		 breakln("Unsorted Array:");
		 
		 //Displaying Unsorted array
		 for(int element : intArray) {
			 System.out.print("[" + element + "]");
		 }
		 
		 breakln();
		 
		 //Sorting array using Selection sort
		 for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
				 lastUnsortedIndex--) {

			 int largest = 0;

			 for (int i = 1; i <= lastUnsortedIndex; i++) {
				 if (intArray[i] > intArray[largest]) {
					 largest = i;
				 }
			 }

			 swap(intArray, largest, lastUnsortedIndex);

		 }
		 
		 breakln("Sorted Array:");
		 //Displaying Sorted Array
		 for (int i = 0; i < intArray.length; i++) {
			 System.out.print("[" + intArray[i] + "]");
		 }


	 }

	 public static void swap(int[] array, int i, int j) {

		 if (i == j) {
			 return;
		 }

		 int temp = array[i];
		 array[i] = array[j];
		 array[j] = temp;

	 }
	 
	 public static void breakln() {
		 System.out.println();
	 }
	 
	 public static void breakln(String m) {
		 System.out.print(m + "\n");
	 }

}
