public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) {
        // Memeriksa apakah argumen negatif atau lebih dari 16
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        } else if (n > 16) {
            throw new IllegalArgumentException("Factorial is too large to be computed for numbers greater than 16.");
        }

        // Menghitung faktorial
        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
