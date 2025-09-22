
public class method29 {
    public static String generateOTP() {
        int otp = (int)(100000 + Math.random() * 900000);
        return String.valueOf(otp);
    }

    public static void main(String[] args) {
        String[] otps = new String[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        boolean allSame = true;
        for (int i = 1; i < otps.length; i++) {
            if (!otps[i].equals(otps[0])) {
                allSame = false;
                break;
            }
        }

        if (allSame) {
            System.out.println("Validation Failed: All OTPs are the same!");
        } else {
            System.out.println("Validation Passed: OTPs are unique.");
        }
    }
}
