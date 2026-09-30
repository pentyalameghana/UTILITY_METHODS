public class Utility {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double cToF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static String format(double salary) {
        return "$" + salary;
    }

    public static String format(double salary, String currencySymbol) {
        return currencySymbol + salary;
    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static int getMinIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }

        return result;
    }

    public static boolean isPalindrome(String text) {
        text = text.toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static int getFibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {

        System.out.println("Prime: " + isPrime(7));

        System.out.println("Celsius to Fahrenheit: " + cToF(25));

        System.out.println("Vowels: " + countVowels("Hello World"));

        System.out.println("Salary: " + format(50000));

        System.out.println("Salary: " + format(50000, "₹"));

        System.out.println("Maximum: " + getMax(10, 20));

        System.out.println("Maximum: " + getMax(10, 20, 15));

        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);

        System.out.print("Reversed: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        int[] numbers = {10, 5, 20, 2, 15};
        System.out.println("Minimum Index: " + getMinIndex(numbers));

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] result = merge(a, b);

        System.out.print("Merged: ");
        for (int x : result) {
            System.out.print(x + " ");
        }

        System.out.println();

        System.out.println("Palindrome: " + isPalindrome("Madam"));

        System.out.println("Fibonacci: " + getFibonacci(6));
    }
}