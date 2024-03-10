package _1.JavaExercises;
import java.util.Arrays;

public class ExercisesJavaAssignment2 {

  // 1. Scrie o metoda java care calculeaza cate cuvinte sunt intr-un string.
  public static void wordCount() {
    String text = "1.Write a java method that calculates how many words are in a string.";
    int wordCount = 0;
    boolean inWord = false;
    for (int i = 0; i < text.length(); i++) {
      char character = text.charAt(i);
      if (Character.isLetter(character)) {
        inWord = true;
      }
      //  check if we are not inside a word
      else if (inWord) {
        wordCount++;
        //	reset inWord variable to false because we found the end of the word
        inWord = false;
      }
    }
    System.out.println("The number of words in the text is: " + wordCount);
  }

  // 2. Calculati factorialul fiecarui element din sir.e.g. [1,2,3] -> [1,2,6]
  public static int factorial(int number) {
    if (number == 0 || number == 1)
      return 1;
    else
      // recursive function
      return number * factorial(number - 1);
  }
  
  public static void callFactorialFunction() {
	  int[] inputArray1 = {1, 2, 3, 4, 5};
	  int[] factorialArray = new int[inputArray1.length];
	  for (int i = 0; i < inputArray1.length; i++) {
	      factorialArray[i] = factorial(inputArray1[i]);
	  }
	  System.out.println("Input array: " + Arrays.toString(inputArray1));
	  System.out.println("Array with factorials: " + Arrays.toString(factorialArray));
  }

  /*  3.Am un array de nr intregi, daca elementul e pe o pozitie para, elementul va deveni cubul lui,
	    daca elementul e pe o pozitie impara, elementul se va schimba in factorialul lui. 
  */
  public static void factorialOrCube() {
	int[] inputArray3 = {11, 12, 13, 14, 15};
    int[] transformedArray = new int[inputArray3.length];
    for (int i = 0; i < inputArray3.length; i++) {
      if (i % 2 == 0)
        transformedArray[i] = inputArray3[i] * inputArray3[i] * inputArray3[i];
      else
        transformedArray[i] = factorial(inputArray3[i]);
    }
    System.out.println("Input array: " + Arrays.toString(inputArray3));
    System.out.println("Transformed array: " + Arrays.toString(transformedArray));
  }

  // 4. Calculati a la puterea i, unde a e un element din sir si i este indexul lui. e.g. [1,2,3] -> [1, 2, 9]
  public static void AtoPowerE() {
	int[] inputArray3 = {11, 12, 13, 14, 15};
    int[] exponentialPowerArray = new int[inputArray3.length];
    for (int i = 0; i < inputArray3.length; i++) {
      exponentialPowerArray[i] = (int) Math.pow(inputArray3[i], i);
    }
    System.out.println("Input array: " + Arrays.toString(inputArray3));
    System.out.println("Exponential power array: " + Arrays.toString(exponentialPowerArray));
  }
  
  // 5. Returnati cuvantul care are cele mai multe vocale dintr-un sir
  public static void wordsWithMostVowels() {
	  String text = "Return the word that has the most vowels in a string";
	  String[] words = text.split("\\s+");
	  System.out.println(Arrays.toString(words));
      int maxNumberVowels = 0;
	  String wordWithMostVowels= "";
	  // enhanced for
      for (String word : words) {
          int numberVowels = countVowels(word);
          if (numberVowels > maxNumberVowels) {
        	  maxNumberVowels = numberVowels;
        	  wordWithMostVowels = word;
          }
      }
      System.out.println("The word with the most vowels is: " + wordWithMostVowels);
  }
  
  public static int countVowels(String text) {
	  text = text.toLowerCase(); 
      int numberVowels = 0;
      for (int i = 0; i < text.length(); i++) {
          char litera = text.charAt(i);
          if (litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u') {
        	  numberVowels++;
          }
      }
      return numberVowels;
  }
  
  // 6. Aveti un sir de cuvinte, returnati stringul format din prima litera a fiecarui cuvant
  public static void firstLetterOfEachWord() {
	  String text = "You have a string of words, return the string consisting of the first letter of each word";
	  String result = "";
	  String[] words = text.split("\\s+");
	  System.out.println(Arrays.toString(words));
	  for (String word : words) {
		char firstLetter = word.charAt(0);
		result = result.concat(Character.toString(firstLetter));
	  }
	  System.out.println(result);
  }

  public static void main(String[] args) {
	System.out.println("---Exercise 1---");
    wordCount();
    
    System.out.println("\n---Exercise 2---");
    callFactorialFunction();

    System.out.println("\n---Exercise 3---");
    factorialOrCube();

    System.out.println("\n---Exercise 4---");
    AtoPowerE();
    
    System.out.println("\n---Exercise 5---");
    wordsWithMostVowels();
    
    System.out.println("\n---Exercise 6---");
    firstLetterOfEachWord();
  }
}