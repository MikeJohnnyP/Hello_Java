package lession_2;

public class ExtraEx {
    int bi = 23;

    public ExtraEx(int bi) {
        bi = this.bi;
    }

    // 1. Chuyển từ hệ cơ số 10 sang hệ cơ số 2
    // Có dùng đệ quy
    public static String decimalToBinary(int dec) {
        if (dec == 0) {
            throw new IllegalArgumentException();
        } else if (dec == 1) {
            return "1";
        } else {
            return decimalToBinary(dec / 2) + dec % 2;
        }
    }

    // Không dùng đệ quy
    public static void decimalToBinary2(int dec) {
        int du, i = 1, sum = 0;
        do {
            du = dec % 2;
            sum += (i * du);
            dec = dec / 2;
            i = i * 10;
        } while (dec > 0);

        System.out.println(sum);
    }

    // Kiểm tra một số có chia hết cho cả 3 và 9
    // Không dùng đệ quy
    public static void checkDivisible(int n) {
        int sum = 0;
        if(n<0)
        n = n * -1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;

        }
        if (sum % 9 == 0)
            System.out.println("Số chia hết cho cả hai và chín");
        else
            System.out.println("Số không chia hết cho cả hai và chín");

    }

    // Dùng đệ quy
    public static int recursiveSumDigit(int n) {
         if(n<0)
        n = n * -1;
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + recursiveSumDigit(n / 10);
        }

    }

    public static void checkDivisible2(int n) {
        if (recursiveSumDigit(n) % 9 == 0) {
            System.out.println("Số chia hết cho cả hai và chín");
        } else {
            System.out.println("Số không chia hết cho cả hai và chín");
        }
    }
    public static void checkDivisible3Not9(int n){

    }

    public static void main(String[] args) {
        // System.out.println(decimalToBinary(65));
        // decimalToBinary2(-18);
        checkDivisible(-18);
        checkDivisible(-18);

    }

}
