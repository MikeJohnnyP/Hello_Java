import java.util.Arrays;

public class Array1D {

    public void updateValue(int[] array, int value, int position) {
        array[position] = value;
        System.out.println("Update value: " + Arrays.toString(array));
    }

    public void findValue(int[] array, int target) {
        for (int i : array) {
            if (i == target) {
                System.out.println(target + " is present in this array");
                break;
            }
        }

    }

    public void print1DArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public int average(int[] array) {
        int average = 0;
        int sum = 0;
        for (int i : array) {
            average = (sum += i) / array.length;
        }
        return average;
    }
    //Test class
     public static void main(String[] args) {
        Array1D metArray1D = new Array1D();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Original array: "+Arrays.toString(arr));
        metArray1D.updateValue(arr, 3, 3);
        metArray1D.findValue(arr, 5);
        metArray1D.print1DArray(arr);
        System.out.println(metArray1D.sum(arr));
        System.out.println(metArray1D.average(arr));

    }

}
