//Convert a String to an int

//Convert String to INt


package JavaPracticeProgram;



public class ConvertStringToInt {
    public static void main(String[] args) {
        String numberStr = "123";
        //String numberStr = "123abc";  // ❌ throws NumberFormatException

        // Convert String to int
        int number = Integer.parseInt(numberStr);

        Integer num = Integer.valueOf("123"); //Alternative: Integer.valueOf(String)
        System.out.println("Converted Integer: " +number);
    }
}
