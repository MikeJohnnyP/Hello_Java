package lession_2;

public class ExtraEx {

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
        if (n < 0)
            n = n * -1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;

        }
        if (sum % 9 == 0)
            System.out.println("Số chia hết cho cả ba và chín");
        else
            System.out.println("Số không chia hết cho cả ba và chín");

    }

    // Dùng đệ quy
    public static int sumDigit(int n) {
        if (n < 0)
            n = n * -1;
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumDigit(n / 10);
        }

    }

    public static void checkDivisible2(int n) {
        if (sumDigit(n) % 9 == 0) {
            System.out.println("Số chia hết cho cả ba và chín");
        } else {
            System.out.println("Số không chia hết cho cả ba và chín");
        }
    }

    // kiểm tra một số chia hết cho ba nhưng không chia hết cho 9
    // Dùng đệ quy sử dụng lại sumEveryDigit();
    public static void checkDivisible3Not9(int n) {
        if (sumDigit(n) % 3 == 0 && sumDigit(n) % 9 != 0) {
            System.out.println("Số chia hết cho ba và không chia hết cho chín");
        } else if (sumDigit(n) % 3 == 0 && sumDigit(n) % 9 == 0) {
            System.out.println("Số chia hết cho cả ba và chín");
        } else if (sumDigit(n) % 9 == 0) {
            System.out.println("Số chia hết cho chín ");
        } else
            System.out.println("Số không chia hết cho cả ba và chín");
    }

    // Không sử dụng đệ quy
    public static void checkDivisible3Not9Ver2(int n) {
        int sum = 0;
        if (n < 0)
            n = n * -1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;

        }
        if (sum % 3 == 0 && sum % 9 != 0) {
            System.out.println("Số chia hết cho ba và không chia hết cho chín");
        } else if (sum % 3 == 0 && sum % 9 == 0) {
            System.out.println("Số chia hết cho cả ba và chín");
        } else if (sum % 9 == 0) {
            System.out.println("Số chia hết cho chín ");
        } else
            System.out.println("Số không chia hết cho cả ba và chín");
    }

    // Hãy đếm số lượng chữ số nguyên dương
    // Chuyển vào một số int
    // Đếm chữ số nguyên dương
    public static int countInteger(int num) {
        if (num < 10) {
            return 1;
        }
        return 1 + countInteger(num / 10);
    }

    // Tổng các chữ số nguyên dương
    public static int sumOfDigit(int num) {
        if (num == 0)
            return 0;
        else
            return num % 10 + sumOfDigit(num / 10);
    }

    // Tích các chữ số nguyên dương
    public static int productDigit(int num) {
        if (num == 0)
            return 1;
        else
            return num % 10 * productDigit(num / 10);

    }

    // Đếm số lượng chữ số lẻ
    public static int countOddNumber(int num) {
        if (num == 0)
            return 0;
        else if ((num % 10) % 2 != 0) {
            return 1 + countOddNumber(num / 10);
        } else
            return countOddNumber(num / 10);
    }

    // Tính tổng các chữ số chẵn
    public static int sumOfEvenNumber(int num) {
        if (num == 0)
            return 0;
        else if ((num % 10) % 2 == 0) {
            return (num % 10) + sumOfEvenNumber(num / 10);
        } else
            return sumOfEvenNumber(num / 10);
    }

    // Tính tích các chữ số lẻ
    public static int productOfOddNumber(int num) {
        if (num == 0)
            return 1;
        else if ((num % 10) % 2 != 0)
            return num % 10 * productOfOddNumber(num / 10);
        else
            return productOfOddNumber(num / 10);
    }

    // Tìm chữ số đảo ngược của số nguyên dương
    public static String reverseNumber(int num) {
        if (num == 0)
            return "";
        else
            return num % 10 + reverseNumber(num / 10);
    }
    //Tìm chữ số lớn nhất của số nguyên dương
    public static int maxOfInteger(int num){
        if(num==0)
        return 0;
        else
        return Math.max(num%10, maxOfInteger(num/10));
    }
    public static int minOfInteger(int num){
        if(num==0)
        return 999999999;
        else
        return Math.min(num%10, minOfInteger(num/10));
    }


    public static void main(String[] args) {
        // System.out.println(decimalToBinary(65));
        // decimalToBinary2(-18);
        checkDivisible(-18);
        checkDivisible(-18);
        checkDivisible3Not9(67);
        checkDivisible3Not9Ver2(67);
        System.out.println(countInteger(9000));
        System.out.println(sumOfDigit(67));
        System.out.println(productDigit(99));
        System.out.println(countOddNumber(6789));
        System.out.println(sumOfEvenNumber(78910));
        System.out.println(productOfOddNumber(6789));
        System.out.println(reverseNumber(6789));
        System.out.println(maxOfInteger(6789));
        System.out.println(minOfInteger(6789));
        

    }

}
