package ProblemSolving;

import java.util.Scanner;

public class SecondLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of numbers separated by blank spaces: ");
        String number = scanner.nextLine();
        secondLargestNumber(number);
    }

    private static void secondLargestNumber(String number) {

        String[] numbersString = number.split(" ");
        int[] numbers = new int[numbersString.length];
        for (int i = 0; i < numbersString.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }
        int firstLargest = numbers[0];
        int secondLargest = numbers[0];
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = numbers[index];
            } else if (numbers[index] > secondLargest && numbers[index] != firstLargest) {
                secondLargest = numbers[index];
            }

        }
        System.out.printf("second largest number is: %d", secondLargest);
    }
}

   
            
          
                 
                   
                    
                
           
