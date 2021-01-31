package competitive.programming.practice.common.math;

public class Utility {

    public static int gcd(int A, int B) {
        if (A == 0)
            return B;
        return gcd(B % A, A);
    }
}
