package quests;

import java.util.Scanner;

public class Forsifs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("input number : ");
        int number = scanner.nextInt();
        
        for (int count = 1; count <= number; count = count+1) {
            int PowerOfTwo = (int) Math.pow(2, count);
            if (PowerOfTwo % 8 == 0) {
                System.out.println("2 ** " + count + " = " + PowerOfTwo);
            }
        }

        scanner.close();
    }
}
