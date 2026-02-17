import java.util.*;
public class GenericArrayUtility {
    // Generic merge method
    public static <T> T[] mergeArrays(T[] a, T[] b) {

        if (a == null && b == null) {
            return null;
        }

        if (a == null) {
            return Arrays.copyOf(b, b.length);
        }

        if (b == null) {
            return Arrays.copyOf(a, a.length);
        }


        T[] merged = Arrays.copyOf(a, a.length + b.length);


        System.arraycopy(b, 0, merged, a.length, b.length);

        return merged;
    }
}
