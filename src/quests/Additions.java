package quests;

import java.util.Scanner;

public class Additions {
    
    public static int addTwoNumbers(int intFirst, int intSecond) {
        return intFirst + intSecond;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int intFirst = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int intSecond = scanner.nextInt();
        
        int sum = addTwoNumbers(intFirst, intSecond);
        System.out.println(intFirst + " + " + intSecond + " = " + sum);
        
        scanner.close();
    }
}
