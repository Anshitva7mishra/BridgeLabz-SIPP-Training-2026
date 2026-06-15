public class mathWizard {
    private int instanceVariable = 10;

    public void demonstrateScope() {
        int localVariable = 20;
        System.out.println(instanceVariable);
        System.out.println(localVariable);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static double factorial(double n) {
        double fact = 1.0;
        for (int i = 2; i <= (int) n; i++) fact *= i;
        return fact;
    }

    public static long fibonacci(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static double power(double base, int exp) {
        double result = 1.0;
        for (int i = 0; i < exp; i++) result *= base;
        return result;
    }

    public static void main(String[] args) {
        mathWizard mw = new mathWizard();
        mw.demonstrateScope();
    }
}
