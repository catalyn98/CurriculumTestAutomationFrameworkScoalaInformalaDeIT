package _1.JavaExercises;

public class Methods {
	public static void main(String[] args) {
		writeText();
		writeAnyText("Java");
		int result = returnSum(10, 5);
		System.out.println(result);
		System.out.println(isEven(7));
		System.out.println(computeResult(2));
		System.out.println(computeResult(3));
		System.out.println(computeSum(10));
		System.out.println(computeFactorial(5));
		computeVowelsAndConsonants("Java is wonderfull!");
		computeWhile();
		computeDoWhile();
	}
	
	public static void writeText() {
		System.out.println("Java");
	}
	
	public static void writeAnyText(String text) {
		System.out.println(text);
	}
	
	public static int returnSum(int a, int b) {
		return a + b;
	}
	
	/*
	public static boolean isEven(int number) {
		if(number % 2 == 0)
			return true;
		else
			return false;
	}
	*/
	
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static int getCube(int nr) {
		return ((int)Math.pow(nr, 3));
	}
	
	public static int getSquare(int nr) {
		return ((int)Math.pow(nr, 2));
	}
	
	public static int computeResult(int nr) {
		if(isEven(nr))
			return getSquare(nr);
		else 
			return getCube(nr);
	}
	
	public static int computeSum(int nr) {
		int sum = 0;
		for(int i = 0; i < nr; i++)
			sum += i;
		return sum;
	}
	
	public static int computeFactorial(int nr) {
		int prod = 1;
		for(int i = 1; i <= nr; i++)
			prod *= i;
		return prod;
	}
	
	public static boolean isVowel (char ch) {
		ch = Character.toLowerCase(ch);
		if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u') 
			return true;
		else
			return false;
	}
	
	public static boolean isLetter(char ch) {
		ch = Character.toLowerCase(ch);
		if(ch >= 'a' && ch <='z')
			return true;
		else
			return false;
	}
	
	public static void computeVowelsAndConsonants(String word) {
		int vowels  = 0;
		int consonants = 0;
		for(int i = 0; i < word.length(); i++) {
			if(isLetter(word.charAt(i))) {
				if(isVowel(word.charAt(i))) {
					vowels++;
				}
				else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels: " + vowels + ", consonants: " + consonants);
	}
	
	public static void computeWhile() {
		int i = 0;
		System.out.print("\ncomputeWhile: ");
		while(i < 6) {
			System.out.print(i + " ");
			i++;
		}
	}
	
	public static void computeDoWhile() {
		int i = 0;
		System.out.print("\ncomputeDoWhile: ");
		do{
			System.out.print(i + " ");
			i++;
		}
		while(i < 6);
	}
}
