// Convert a double to int (Narrowing - Explicit Casting)
//Explicit cast ((int)) is required, and decimal part is lost.



package JavaPracticeProgram.TypeCastingQue;

public class DoubleToIntTypeCasting {
    public static void main(String[] args) {
        double num =10.99;
        int result = (int)num; //Explict Type Casting

        System.out.println("Converted int value : " + result);
    }
}
