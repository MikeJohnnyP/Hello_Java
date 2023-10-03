package lession_2;

public class ToanDeQuy {
    public static double soulveEx2(int n) {
        double result = 0;
        if (n == 0)
            return 1.0;
        else {
            result = 1 / (Math.pow(2, n) * factorial(n)) + soulveEx2(n - 1);
        }
        return result + 1;
    }

    public static int factorial(int n) {
        int result = 0;
        if (n == 0)
            result = 1;
        else {
            result = n * factorial(n - 1);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(soulveEx2(2));
        System.out.println(soulveEx2(10));
        System.out.println(soulveEx2(25));
    }

}
