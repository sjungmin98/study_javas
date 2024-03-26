import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Dd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listProblems = new ArrayList<String>();

        listProblems.add("1. 문제: Python에서 변수를 선언하는 방법은? (점수: 10점)");
        listProblems.add("2. 문제: Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
        listProblems.add("3. 문제: Python에서 조건문을 작성하는 방법은? (점수: 10점)");
        listProblems.add("4. 문제: Python에서 함수를 정의하는 방법은? (점수: 5점)");

        HashMap<String, String> hashOption = new HashMap<String, String>();

        hashOption.put("답항","1) var name, 2) name = value, 3) set name, 4) name == value");
        hashOption.put("답항", " 1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        hashOption.put("답항", "2) for-in, 3) while, 4) def");
        hashOption.put("답항", "1) class, 2) def, 3) import, 4) return");

        System.out.println("아래는 4개의 Python 관련 문제와 각 문항의 난이도에 따른 점수화");
        for (String problem : listProblems) {
            for (String option : hashOption.values()) {
                System.out.println(problem); 
                System.out.println("답항 : "+option);
                System.out.print("정답 : ");
                String stranswer = scanner.nextLine();
                break;
                }
            }
        scanner.close();   
    }
    
}