public class springSeason {
    public static void main(String[] args) {
        if (args.length < 2) return;
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20 && day <= 31) ||
               (month == 4 && day >= 1 && day <= 30) ||
               (month == 5 && day >= 1 && day <= 31) ||
               (month == 6 && day >= 1 && day <= 20);
    }
}
