package JavaPracticeProgram;

//Write a Java program to find duplicate elements in an array.


import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1};
        duplicate(arr);
    }
    public static void duplicate(int[]arr)
    {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num :arr){
            if(!seen.add(num)){
                duplicates.add(num);

            }
    }
        System.out.println("Duplicat Elements : " +duplicates);
}
}
