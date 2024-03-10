package _1.JavaExercises;
import java.util.Scanner;

public class ExercisesJavaAssignment1 {

    // 1.Calculate the sum of the first 50 numbers, higher than 11.
    public static void sumOfTheFirstFiftyNumbers() {
        int sum = 0;
        for (int i = 0; i <= 50; i++) {
            if (i > 11) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of the first 50 numbers, higher than 11 is " + sum);
    }

    // 2.Calculate the cube of the first 5 numbers.
    public static void cubeOfTheFirstFiveNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("For number " + i + " the cube is " + (int) Math.pow(i, 3));
        }
    }

    // 3. I take into consideration the numbers from 1 to 6. For odd numbers, compute their sum, for even numbers, compute their product. 
    public static void computeSumAndProduct() {
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= 6; i++) {
            if (i % 2 != 0) {
                sum += i;
            } else {
                product *= i;
            }
        }
        System.out.println("The sum of the odd numbers is " + sum);
        System.out.println("The product of the even numbers is " + product);
    }

    // 4.Write a program that prints the same message backwards, one character per line For example:"message"
    public static void printTextBackwards() {
        String text = "message";
        for (int i = text.length() - 1; i >= 0; i--) {
            char character = text.charAt(i);
            System.out.println(character);
        }
    }

    // 5.Write a program that prints every 3rd character from a word
    public static void printEveryThirdCharacter() {
        String text = "ABcDEfGHiJKlMNoPQrSTuVXyZ";
        System.out.print("Every 3rd character in the word: ");
        for (int i = 2; i < text.length(); i += 3) {
            char character = text.charAt(i);
            System.out.print(character + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("\n--MENU--");
            System.out.println("1.Calculate the sum of the first 50 numbers, higher than 11.");
            System.out.println("2.Calculate the cube of the first 5 numbers.");
            System.out.println("3.I take into consideration the numbers from 1 to 6. For odd numbers, compute their sum, for even numbers, compute their product.");
            System.out.println("4.Write a program that prints the same message backwards, one character per line For example:\"message\"");
            System.out.println("5.Write a program that prints every 3rd character from a word");
            System.out.println("6.Exit from the programme");
            System.out.println("\nEnter a number from 1 to 6:");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    sumOfTheFirstFiftyNumbers();
                    break;
                case 2:
                    cubeOfTheFirstFiveNumbers();
                    break;
                case 3:
                    computeSumAndProduct();
                    break;
                case 4:
                    printTextBackwards();
                    break;
                case 5:
                    printEveryThirdCharacter();
                    break;
                case 6:
                    System.out.println("The execution of the programme has ended!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unavailable option!");
            }
        }
    }
}