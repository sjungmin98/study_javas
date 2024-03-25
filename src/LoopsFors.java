import java.util.ArrayList;

public class LoopsFors {
    public static void main(String[] args) {
        ArrayList<String> listFirst = new ArrayList<String>();
        // 값 넣기
        listFirst.add("Volvo");
        listFirst.add("BMW");
        listFirst.add("Ford");
        // for (statement1;....) {
        //  ...
        // }
        for(int i = 0; i < listFirst.size(); i++) {
            System.out.println("for count" + listFirst.get(i));
        }

        // for (type variableName : arrayName) {
        // code block to be executed
        // }
        for(String str : listFirst) {
            System.out.println("for each" + str);
        }

        System.out.println("Hello World!");
        // return = 0
    }    
}
