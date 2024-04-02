public class SinggelArray {

    public static void main(String[] args) {
        //Cara 1
        int [] x;
        x = new int[3];
        x[0] = 20;
        x[1] = 10;
        x[2] = 30;
        System.out.println("Nilai x[0] : " + x[0]);
        System.out.println("Nilai x[0] : " + x[1]);
        System.out.println("Nilai x[0] : " + x[2]);
        
        System.out.println("====================================");
        
        //Cara 2
        int[] y = {50, 40, 60};
        System.out.println("Nilai y[0] : " + y[0]);
        System.out.println("Nilai y[0] : " + y[1]);
        System.out.println("Nilai y[0] : " + y[2]);
    }
}