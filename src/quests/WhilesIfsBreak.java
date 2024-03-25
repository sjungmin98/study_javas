package quests;

import java.util.Scanner;

public class WhilesIfsBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean whileFlag = true;
        
        while (whileFlag) {
            System.out.println("점수를 입력하세요. (종료하려면 -1 입력): ");
            int score = scanner.nextInt();
            
            if (score == -1) {
                whileFlag = false;
                continue;
            }
            
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else {
                System.out.println("F");
            }
        }
        
        System.out.println("프로그램 종료");
        scanner.close();
    }
}
