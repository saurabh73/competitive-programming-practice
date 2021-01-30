package competitive.programming.practice.common.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeUtility {

    private int max;
    private boolean[] primes;

    public PrimeUtility(int max) {
        this.max = max;
        primes = new boolean[max+1];
        Arrays.fill(primes, true);
        primes[0]=false;
        primes[1]=false;
        for (int i=2;i<=max;i++) {
            if (primes[i]) {
                int index = 2;
                while (i*index <= max) {
                    primes[i*index] = false;
                    index++;
                }
            }
        }

    }

    public int[] getPrimes() {
        List<Integer> primeList = new ArrayList<>();
        for(int i=0;i<primes.length;i++) {
            if (primes[i]) {
                primeList.add(i);
            }
        }
        return primeList.stream().mapToInt(i ->i).toArray();
    }

    public boolean isPrime(int num) {
        if (num > max) {
            throw new IndexOutOfBoundsException();
        } else {
            return primes[num];
        }
    }
}
