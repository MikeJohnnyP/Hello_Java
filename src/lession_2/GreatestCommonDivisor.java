package lession_2;

public class GreatestCommonDivisor {
    public static int findGreatestCommonDivisor(int x, int y){
        if(y == 0)
        return x;
        else
        return findGreatestCommonDivisor(y, x%y);
    }
    public static void main(String[] args) {
        System.out.println(findGreatestCommonDivisor(10, 60));
        System.out.println(findGreatestCommonDivisor(2, 8));
        System.out.println(findGreatestCommonDivisor(100, 234));
    }
}
