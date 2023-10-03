public class Fibonacci {
    public static int fibo(int x){
        if(x==0)
        return 0;
        if(x==1)
        return 1;

       return fibo(x-1)+fibo(x-2); 
    }
    public static void main(String[] args) {
        int[] test = {3, 20, 11};
        for (int i = 0; i < test.length; i++) {
            System.out.println(fibo(test[i]));            
        }
    }

    
    
}
