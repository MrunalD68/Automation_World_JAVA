//Convert a byte to int and an int to byte
//Be careful while narrowing, as it may cause overflow issues.



package JavaPracticeProgram.TypeCastingQue;

public class ByteToIntViceVersa {
    public static void main(String[] args) {
        byte smallnum = 100;
        int bignumber = smallnum; //Widening
        System.out.println("Converted Int : " + bignumber);



        int largenum = 300;
        byte smallnumber = (byte)largenum; //Narrowing
        System.out.println("Converted Byte : " +smallnumber); //Overflow occurs
    }
}
