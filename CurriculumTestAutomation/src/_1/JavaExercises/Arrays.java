package _1.JavaExercises;

public class Arrays {
	public static void main(String[] args) {
		int[] myArray = {4, 8, 9, 13, 2, 8};
		// i -> index;
		// myArray[0] -> valoarea de pe pozitia 0
		// myArray[i] -> valoarea de pe pozitia i
		
		System.out.println(myArray[0]);
		System.out.println(myArray.length);
		myArray[3] = 10;
		// parcurgere array (metoda 1)
		for(int i = 0; i < myArray.length; i++ ) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
		// parcurgere array (metoda 2)
		for(int numbers : myArray) {
			System.out.print(numbers + " ");
		}
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.print("\nThe sum of the elements in the array is ");
		System.out.print(computeArray(array));
		
		int[] secondArray = {4, 7, 2, 1};
		int[] thirdArray = replaceValues(secondArray, 0);
		System.out.println("\nreplaceValues function: ");
		for(int numbers : thirdArray) {
			System.out.print(numbers + " ");
		}
		
		System.out.println();
		String[] colors = {"albastru", "mov", "rosu", "roz"};
		returnColor(colors);
	}
	
	public static int computeArray(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++ ) {
			sum += array[i];
		}
		return sum;
	}
	
	public static int[] replaceValues(int[] array, int nr) {
		for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = nr;
            }
        }
		return array;
	}
	
	public static void returnColor(String[] colors) {
		for(int i = 0; i < colors.length; i++ ) {
			if(colors[i].length() == 3) {
				System.out.print(colors[i] + " ");
			}
		}
	}
}
