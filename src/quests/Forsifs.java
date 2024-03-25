package quests;

import java.util.Scanner;

public class Forsifs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("input number : ");
        int number = scanner.nextInt();
        
        for (int count = 1; count <= number; count = count + 1) {
            if (count % 4 == 0) {
                System.out.println(count + " = 4의 배수");
            }
        }

        scanner.close();
    }
}
