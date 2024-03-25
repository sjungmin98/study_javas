package quests;

import java.util.ArrayList;
import java.util.Scanner;

public class pollsWithoutDB {
    public static void main(String[] args) {
        ArrayList<String> questions = new ArrayList<String>();
        ArrayList<String> answers = new ArrayList<String>();
        ArrayList<String> responses = new ArrayList<String>();

        questions.add("인터스텔라 선호도");
        questions.add("해리포터 선호도");
        questions.add("어벤져스 선호도");

        answers.add("1) 좋음 2) 중간 3) 나쁨");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ". " + questions.get(i));
            for (String option : answers) {
                System.out.println(option);
            }
            System.out.print("답하기 : ");
            String response = scanner.nextLine(); 
            responses.add(response); 
        }

        System.out.print("답한 내용 출력 : ");
        for (int i = 0; i < responses.size(); i++) {
            System.out.print(responses.get(i));
            if (i < responses.size() - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
