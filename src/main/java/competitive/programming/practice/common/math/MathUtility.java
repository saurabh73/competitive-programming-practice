package competitive.programming.practice.common.math;

public class MathUtility {

    public static int gcd(int A, int B) {
        if (A == 0)
            return B;
        return gcd(B % A, A);
    }

    public static int encodeWithCantorFunction(int x, int y) {
        // [0.5 * (x + y) * (x + y + 1) + y]
        return ((int) (((x + y) * (x + y + 1)) * 0.5) + y);
    }

    public static int encodeWithSzudzikFunction(int x, int y) {
        return x >= y ? x * x + x + y : y * y + x;
    }


    public static int[] decodeWithCantorFunction(int z) {
        int w = (int) ((int) (Math.sqrt(8 * z + 1) - 1) * 0.5);
        int t = (int) ((int) (Math.pow(w, 2) + w) * 0.5);
        int y = z - t;
        int x = w - y;
        return new int[]{x, y};
    }

    public static int[] decodeWithSzudzikFunction(int z) {
        int temp = (int) (z - Math.pow(Math.floor(Math.sqrt(z)), 2));
        if (temp < Math.floor(Math.sqrt(z))) {
            int y = (int) Math.floor(Math.sqrt(z));
            return new int[]{temp, y};
        } else {
            int x = (int) Math.floor(Math.sqrt(z));
            int y = temp - (int) Math.floor(Math.sqrt(z));
            return new int[]{x, y};
        }
    }
}
