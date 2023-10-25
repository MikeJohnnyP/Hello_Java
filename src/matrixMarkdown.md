Cannot sum two matrix
Multiply matrix with one number: 
 6  12 
 24  36 
 18  48 
Multiply two matrix: 
 7  19  12 
 26  60  38 
 23  73  46 

- ##### Khởi tạo biến và constructor.

```c
public class Matrix {
    private int[][] matrix1;
    private int[][] matrix2;
    private int numToMulti;

    public Matrix(int[][] matrix1, int[][] matrix2, int numToMulti ){
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.numToMulti = numToMulti;
        sumOfMatrix(matrix1, matrix2);
        multiWithOneNum(matrix1, numToMulti);
        multiplyTwoNumber(matrix1, matrix2);
    }
```

---

- ##### Phương thức cộng hai ma trận

```c
 private void sumOfMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] temp;
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            temp = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp[i].length; j++) {
                    temp[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("Sum Of two matrix: ");
            printMatrix(temp);
        } else {
            System.out.println("Cannot sum two matrix");

        }
    }
```
---
- ##### Phương thức nhân ma trận với một số
```c
private void multiWithOneNum(int[][] matrix, int numToMulti) {
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                temp[i][j] = numToMulti * matrix[i][j];
            }
        }
        System.out.println("Multiply matrix with one number: ");
        printMatrix(temp);
    }
```
--- 
- ##### Phương thức nhân hai ma trận
```c
 private void multiplyTwoNumber(int[][] matrix1, int[][] matrix2) {
        int[][] temp;
        if (matrix1[0].length == matrix2.length) {
            temp = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp.length; j++) {
                    for (int colunms = 0; colunms < matrix1[i].length; colunms++) {
                        temp[i][j] += matrix1[i][colunms] * matrix2[colunms][j];
                    }
                }
            }
            System.out.println("Multiply two matrix: ");
            printMatrix(temp);
        } else {
            System.out.println("Cannot multiply two matrix");
        }
    }
```
---
- ##### Phương thức in ma trận ra màn hình
```c
 private void printMatrix(int[][] sumOfMatrix) {
        for (int i = 0; i < sumOfMatrix.length; i++) {
            for (int j = 0; j < sumOfMatrix[i].length; j++) {
                if (sumOfMatrix[i][j] == -1) {
                    System.out.print(sumOfMatrix[i][j] + " ");
                } else {
                    System.out.print(" " + sumOfMatrix[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
```
---
- ##### Hàm main và test output
```c
 public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }
                        ,{ 4, 6, 7 }
                        ,{ 3, 8, 5 } };

        int[][] arr2 = { { 5, 3, 2 }
                        ,{ 1, 8, 5 }
                        ,{ 4, 2, 7 } };

        int[][] arr3 = { { 1, 2 }
                        ,{ 4, 6 }
                        ,{ 3, 8 } };

        int[][] arr4 = { { 5, 3, 2 }
                        ,{ 1, 8, 5 } };
        int num = 6;

        Matrix setMatrix1 = new Matrix(arr1, arr2, num);
        Matrix setMatrix2 = new Matrix(arr3, arr4, num);
    }
```
- ***Output với arr1 và arr2***
```c
Sum Of two matrix: 
 6  5  5 
 5  14  12 
 7  10  12 
Multiply matrix with one number: 
 6  12  18 
 24  36  42 
 18  48  30 
Multiply two matrix: 
 19  25  33 
 54  74  87 
 43  83  81 
```
- ***Output với arr3 và arr4***
```c
Cannot sum two matrix
Multiply matrix with one number: 
 6  12 
 24  36 
 18  48 
Multiply two matrix: 
 7  19  12 
 26  60  38 
 23  73  46 <!-- slide -->


```

