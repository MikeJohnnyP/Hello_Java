# MineSweeper
Tên: **Tạ Hoàng Phúc**
MSSV: **22130220** 

---
- ##### Khởi tạo các biến và constructor
```c
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
```
---
- ##### Phương thức tạo ma trận bom  
```c
private void createRandomBoomMatrix(int[][] matrix) {
        int temp = 0;
        while (temp < numOfBoom) {
            setUpBoom(matrix);
            temp++;
        }
        fillAround(matrix);
    }
```
---
- ##### Phương thức đặt bom ngẫu nhiên trong ma trận
```c
 private void setUpBoom(int[][] matrix) {
        int ranX = new Random().nextInt(rows);
        int ranY = new Random().nextInt(colunms);
        if (matrix[ranX][ranY] == -1) {
            setUpBoom(matrix);
        } else {
            matrix[ranX][ranY] = -1;
        }
    }
```
---
- ##### Phương thức đếm số bom xung quanh
```c
 private void fillAround(int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < colunms; j++) {
                if (matrix[i][j] == -1) {
                    continue;
                }
                int count = 0;
                for (int dx = -1; dx <= 1; dx++) {
                    for (int dy = -1; dy <= 1; dy++) {
                        if (dx == 0 && dy == 0) {
                            continue;
                        }
                        if (i + dx >= 0 && i + dx < rows && j + dy >= 0 && j + dy < colunms) {
                            if (matrix[i + dx][j + dy] == -1) {
                                count++;
                            }
                        }
                    }
                }
                matrix[i][j] = count;
            }
        }
    }
```
---
- ##### Phương thức im ma trận ra màn hình
```c
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
```
---
- ##### Hàm main và test ouput
```c
  public static void main(String[] args) {
        MineSweeper allMine1 = new MineSweeper(5, 5, 5);
        MineSweeper allMine2 = new MineSweeper(10, 10,10);
        MineSweeper allMine3 = new MineSweeper(4, 8, 5);
    }
```
- ***Số cột với dòng là 5, số quả bom là 5***
```c
-1 -1  1  0  0 
 3  3  2  0  0 
 2 -1  2  1  1 
 2 -1  2  1 -1 
 1  1  1  1  1 
```
- ***Số cột với dòng là 10, số quả bom là 10***
```c
 0  0  0  1 -1  1  0  1 -1  1 
 0  0  0  1  2  2  1  1  1  1 
 0  0  0  0  2 -1  2  0  0  0 
 0  0  0  0  2 -1  2  0  0  0 
 0  0  0  0  1  1  1  0  0  0 
 0  1  1  1  0  0  0  0  1  1 
 1  2 -1  2  1  0  0  0  2 -1 
 2 -1  4 -1  1  0  0  0  2 -1 
 2 -1  3  1  1  0  0  0  1  1 
 1  1  1  0  0  0  0  0  0  0 
```
- ***Số cột là 4, số dòng là 8, số quả bom là 5***
```c
-1 -1  2  1  0  1 -1  1 
 2  3 -1  1  0  1  1  1 
 0  1  1  1  0  0  1  1 
 0  0  0  0  0  0  1 -1 
```