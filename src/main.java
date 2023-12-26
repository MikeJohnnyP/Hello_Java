public class main {
    public static void main(String[] args) {
        double timer = System.nanoTime();
        double x = 8;
        double y = 9; 
        double c = 0;
        double delta = (System.nanoTime()- timer) / (1000000000/60);
        
        System.out.println(--delta);
    }
    
}
