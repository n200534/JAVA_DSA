package recursion.lec1;

public class goodnumber {
     public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;  // positions: 0,2,4,...
        long oddPositions = n / 2;         // positions: 1,3,5,...

        long part1 = pow(5, evenPositions); // even positions
        long part2 = pow(4, oddPositions);  // odd positions

        return (int)((part1 * part2) % MOD);
    }

    // Recursive fast power
    long pow(long x, long n) {
        if (n == 0) return 1;

        long half = pow(x, n / 2);
        long result = (half * half) % MOD;

        if (n % 2 == 1) {
            result = (result * x) % MOD;
        }

        return result;
    }
}
