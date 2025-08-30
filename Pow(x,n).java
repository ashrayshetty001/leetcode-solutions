class Solution {
    public double myPow(double x, int n) {
        // Use a long to handle the full range of int exponents without overflow
        long N = n;
        
        // Base case for recursion: x^0 is 1
        if (N == 0) {
            return 1.0;
        }

        // Handle negative exponents by inverting x and negating N
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        // Recursive step: Binary Exponentiation
        double half = myPow(x, (int)(N / 2));

        // If N is even, x^N = (x^(N/2))^2
        if (N % 2 == 0) {
            return half * half;
        } else { // If N is odd, x^N = x * (x^(N/2))^2
            return x * half * half;
        }
    }
}
