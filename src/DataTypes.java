public class DataTypes {
    public static void main(String[] args){
        // Numbers
        int intFirst = 3;
        // intFirst = 5.2
        // Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from double to int.
        // In case of incorrect results
        // intFirst - 2 / 3
        System.out.println("Numbers int First : "+intFirst);
        
        boolean boolFirst = true;
        // boolFirst = 5
        // Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from int to boolean.
        System.out.println("Boolean bool First : "+boolFirst);

        String stringFirst = "Hello DataTypes!";
        // intFirst = "5.2"
        // Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from String to int.
        System.out.println("String string First : "+stringFirst);

        float floatFirst = 2 / 3;
        System.out.println("float First : "+floatFirst);
        return ;
    }   
}
