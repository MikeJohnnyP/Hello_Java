package lession_2;

public class Recursive {
    //Giai thua
    public static int factorial(int n) {
        if (n == 0) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            return 1;
        } else {

            return n * factorial(n - 1);
        }

    }
// thap sang nhi
    public static String decToBinary(int bi) {
        if (bi == 0) {
            throw new IllegalArgumentException();
        } else if (bi == 1) {
            return "1";
        } else {
            return decToBinary(bi / 2) + bi % 2;
        }
    }

    
    
// nhi sang thap
    public static int biToDec2(String binary) {//Chưa giải xong
        if (binary.length() == 1) {
            return 1;
        } else {
            int numAt = binary.charAt(binary.length() - 1);
            // int to = binary.length()-1;
            return biToDec2(binary.substring(binary.length() - 1)) * 2 + numAt;
        }
    }

    // Phương thức chuyển số nhị phân sang thập phân
    public static int binaryToDecimal(String binary) {
        // Nếu chuỗi rỗng, trả về 0
        if (binary.isEmpty()) {
            return 0;
        }
        // Nếu chuỗi chỉ có một ký tự, trả về giá trị của ký tự đó
        if (binary.length() == 1) {
            return Integer.parseInt(binary);
        }
        // Lấy ký tự đầu tiên của chuỗi
        char first = binary.charAt(0);
        // Lấy độ dài của chuỗi
        int n = binary.length();
        // Lấy chuỗi con bắt đầu từ vị trí thứ hai
        String rest = binary.substring(1);
        // Tính toán giá trị của số nhị phân theo công thức
        int decimal = Integer.parseInt(String.valueOf(first)) * (int) Math.pow(2, n - 1) + binaryToDecimal(rest);
        // Trả về kết quả
        return decimal;
    }
    public static String TowerOfHanoi(int x, String)
    // Test class
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        String bi = "1010";
        String bi2 = "101";
        System.out.println("Giai thừa của "+x+" là: "+factorial(x));
        System.out.println("Hệ nhị phân của "+x+" là: "+decToBinary(x));
        System.out.println("Hệ thập phân của "+bi+" là: "+binaryToDecimal(bi));
        System.out.println();
        System.out.println("Giai thừa của "+y+" là: "+factorial(y));
        System.out.println("Hệ nhị phân của "+y+" là: "+decToBinary(y));
        System.out.println("Hệ thập phân của "+bi2+" là: "+binaryToDecimal(bi2));
    }
    
}
