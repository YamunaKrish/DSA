package Arrayconcepts;

public class Fibonacciwithout3 {
    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            b= a + b;
            a = b - a;
            System.out.print(" " +b+" ");
        }
    }
}
