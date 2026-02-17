import java.util.*;
public class Main {
    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3};
        Integer[] intArray2 = {4, 5, 6};

        Integer[] mergedIntArray =
                GenericArrayUtility.mergeArrays(intArray1, intArray2);

        System.out.println("Merged Integer Array: "
                + Arrays.toString(mergedIntArray));


        String[] stringArray1 = {"apple", "banana"};
        String[] stringArray2 = {"cherry", "date"};

        String[] mergedStringArray =
                GenericArrayUtility.mergeArrays(stringArray1, stringArray2);

        System.out.println("Merged String Array: "
                + Arrays.toString(mergedStringArray));

    }
}