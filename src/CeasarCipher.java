public class CeasarCipher {
    // Khai báo một chuỗi chứa các ký tự trong bảng chữ cái tiếng Anh
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Phương thức mã hóa Caesar
    public static String encrypt(String plainText, int key) {
        // Chuyển đổi chuỗi văn bản thô thành chữ hoa
        plainText = plainText.toUpperCase();
        // Khởi tạo một chuỗi rỗng để lưu kết quả
        String cipherText = "";
        // Duyệt qua từng ký tự trong văn bản thô
        for (int i = 0; i < plainText.length(); i++) {
            // Lấy ra ký tự thứ i
            char letter = plainText.charAt(i);
            // Kiểm tra xem ký tự có thuộc bảng chữ cái không
            if (ALPHABET.indexOf(letter) != -1) {
                // Tìm vị trí của ký tự trong bảng chữ cái
                int position = ALPHABET.indexOf(letter);
                // Áp dụng công thức mã hóa Caesar
                int newPosition = (position + key) % 26;
                // Lấy ra ký tự mới tương ứng với vị trí mới
                char newLetter = ALPHABET.charAt(newPosition);
                // Nối ký tự mới vào chuỗi kết quả
                cipherText += newLetter;
            } else {
                // Nếu ký tự không thuộc bảng chữ cái, giữ nguyên và nối vào chuỗi kết quả
                cipherText += letter;
            }
        }
        // Trả về chuỗi kết quả
        return cipherText;
    }

    // Phương thức giải mã Caesar
    public static String decrypt(String cipherText, int key) {
        // Chuyển đổi chuỗi văn bản mã thành chữ hoa
        cipherText = cipherText.toUpperCase();
        // Khởi tạo một chuỗi rỗng để lưu kết quả
        String plainText = "";
        // Duyệt qua từng ký tự trong văn bản mã
        for (int i = 0; i < cipherText.length(); i++) {
            // Lấy ra ký tự thứ i
            char letter = cipherText.charAt(i);
            // Kiểm tra xem ký tự có thuộc bảng chữ cái không
            if (ALPHABET.indexOf(letter) != -1) {
                // Tìm vị trí của ký tự trong bảng chữ cái
                int position = ALPHABET.indexOf(letter);
                // Áp dụng công thức giải mã Caesar
                int newPosition = (position - key) % 26;
                // Nếu vị trí mới âm, cộng thêm 26 để đảm bảo nằm trong khoảng từ 0 đến 25
                if (newPosition < 0) {
                    newPosition += 26;
                }
                // Lấy ra ký tự mới tương ứng với vị trí mới
                char newLetter = ALPHABET.charAt(newPosition);
                // Nối ký tự mới vào chuỗi kết quả
                plainText += newLetter;
            } else {
                // Nếu ký tự không thuộc bảng chữ cái, giữ nguyên và nối vào chuỗi kết quả
                plainText += letter;
            }
        }
        // Trả về chuỗi kết quả
        return plainText;
    }

    // Phương thức chính để kiểm tra
    public static void main(String[] args) {
        String name = "Ta Hoang Phuc";
        int step = 3;
        System.out.println(name);
        System.out.println("Mã hoá của " + name + " là: " + encrypt(name, step));
        System.out.println("Giải mã của " + encrypt(name, step) + " là: " + decrypt(encrypt(name, step), step));
        
        System.out.println();
        
        String x = "Return to Caesar what belongs to Caesar, and to God what belongs to God.";
        System.out.println(x);
        System.out.println("Mã hoá là " + encrypt(x, step));
        System.out.println("Giải mã của là " + decrypt(encrypt(x, step), step));

    }
}
