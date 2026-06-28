interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code != null && code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {
    @Override
    public boolean validateCoupon(String code) {
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }
        return code.toUpperCase().startsWith("DISCOUNT");
    }
}

public class onlineCouponValidator {
    public static void main(String[] args) {
        String[] coupons = {"DISCOUNT50", "DISC", "DISCOUNT100", "PROMO10", "discount20"};
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Coupon Validation Results:");
        for (String c : coupons) {
            boolean isValid = cart.validateCoupon(c);
            System.out.println("Coupon: " + c + " -> " + (isValid ? "Valid" : "Invalid"));
        }
    }
}
