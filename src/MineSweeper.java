import java.util.Random;

public class MineSweeper {
    private int rows;
    private int colunms;
    private int numOfBoom;
    private int[][] matrix;

    public MineSweeper(int rows, int colunms, int numOfBoom) {
        this.rows = rows;
        this.colunms = colunms;
        this.numOfBoom = numOfBoom;
        this.matrix = new int[this.rows][this.colunms];
        createRandomBoomMatrix(matrix);
        printMatrix(matrix);

    }

    private void createRandomBoomMatrix(int[][] matrix) {
        int temp = 0;
        while (temp < numOfBoom) {
            setUpBoom(matrix);
            temp++;
        }
        fillAround(matrix);
    }

    private void fillAround(int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < colunms; j++) {
                // Nếu là bom, bỏ qua
                if (matrix[i][j] == -1) {
                    continue;
                }
                // Nếu không, đếm số lượng bom xung quanh
                int count = 0;
                // Kiểm tra các ô kề cạnh và đường chéo
                for (int dx = -1; dx <= 1; dx++) {
                    for (int dy = -1; dy <= 1; dy++) {
                        // Bỏ qua ô hiện tại
                        if (dx == 0 && dy == 0) {
                            continue;
                        }
                        // Kiểm tra xem có ra ngoài mảng hay không
                        if (i + dx >= 0 && i + dx < rows && j + dy >= 0 && j + dy < colunms) {
                            // Nếu là bom, tăng biến đếm
                            if (matrix[i + dx][j + dy] == -1) {
                                count++;
                            }
                        }
                    }
                }
                // Gán giá trị đếm được cho ô hiện tại
                matrix[i][j] = count;
            }
        }
    }

    

    private void setUpBoom(int[][] matrix) {
        int ranX = new Random().nextInt(rows);
        int ranY = new Random().nextInt(colunms);
        if (matrix[ranX][ranY] == -1) {
            setUpBoom(matrix);
        } else {
            matrix[ranX][ranY] = -1;
        }
    }

    private void printMatrix(int[][] matrix){
         for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(" " + matrix[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MineSweeper allMine = new MineSweeper(10, 10,15);
    }
}
