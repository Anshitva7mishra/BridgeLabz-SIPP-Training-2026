public class numberChecker2 {
    public static int getCountOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] storeDigits(int number) {
        int count = getCountOfDigits(number);
        int[] digits = new int[count];
        number = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        return sum != 0 && number % sum == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[] counts = new int[10];
        for (int d : digits) counts[d]++;
        int distinctCount = 0;
        for (int c : counts) {
            if (c > 0) distinctCount++;
        }
        int[][] freq = new int[distinctCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (counts[i] > 0) {
                freq[index][0] = i;
                freq[index][1] = counts[i];
                index++;
            }
        }
        return freq;
    }
}
