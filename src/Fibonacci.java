public class Fibonacci {
    public static int fibo(int x){
        if(x==0)
        return 0;
        if(x==1)
        return 1;

       return fibo(x-1)+fibo(x-2); 
    }
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    
    
}
