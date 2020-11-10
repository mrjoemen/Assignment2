package Chapter10;

public class MyInteger { // question 3

    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return this.value % 2 == 1;
    }

    public boolean isPrime() {
        for (int i = 2; i < this.value; i ++) {
            if ( this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger n) {
        return n.value % 2 == 0;
    }

    public static boolean isOdd(MyInteger n) {
        return n.value % 2 == 1;
    }

    public static boolean isPrime(MyInteger n) {
        for (int i = 2; i < n.value; i ++) {
            if (n.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i ++) {
            if (n% i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(MyInteger n) {
        return this.value == n.value;
    }

    public boolean equals(int n) {
        return this.value == n;
    }

    public static void parseInt(char[] arr) {
        for (char c : arr) {
            System.out.println((int) c);
        }
    }

    public static int parseInt(String str) {
        return str.charAt(0);
    }

}
