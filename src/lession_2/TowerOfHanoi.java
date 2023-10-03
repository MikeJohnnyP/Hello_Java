package lession_2;

public class TowerOfHanoi {

    public static String towerOfHanoi(int n, String A, String B, String C){
        if(n==1){
            return " move from "+A+" to "+C;
        }
        else {
            return towerOfHanoi(n-1, A, C, B) + "\n" + (" move from "+A+" to "+C) + "\n" +
            towerOfHanoi(n-1, B, A, C);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3, "A","B","C"));
        // System.out.println(towerOfHanoi(1, "A","B","C"));
        // System.out.println(towerOfHanoi(2, "A","B","C"));
    }
}
