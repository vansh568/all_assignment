public class method25 {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = String.valueOf(num).length();
        while (num > 0) {
            int d = num % 10;
            sum += Math.pow(d, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static boolean isHarshad(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return num % sum == 0;
    }

    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int n1 = 29, n2 = 153, n3 = 18, n4 = 12345, n5 = 42;

        System.out.println(n1 + " is prime? " + isPrime(n1));
        System.out.println(n2 + " is Armstrong? " + isArmstrong(n2));
        System.out.println(n3 + " is Harshad? " + isHarshad(n3));
        System.out.println("Digits in " + n4 + " = " + countDigits(n4));
        System.out.println("Reverse of " + n4 + " = " + reverseNumber(n4));
        System.out.println(n5 + " is even? " + isEven(n5));
    }
}
