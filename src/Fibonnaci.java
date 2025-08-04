import java.util.Scanner;

public class Fibonnaci {

    static int fibonnaciIterative(int position) {
        int a = 0;
        int b = 1;
        int c;

        if(position == 0){
            return 0;
        }else if(position == 1){
            return 1;
        }else{
            for(int i = 2; i <= position; i++){
                c = a + b; // The variable c temporarily stores the next Fibonacci number before updating a and b.
                a = b;
                b = c;

            }
            return b;
        }
    }

    static int fibonnaciRecursive(int position) {
        if(position == 0){
            return 0;
        }else if(position == 1){
            return 1;
        }else{
            return fibonnaciRecursive(position - 1) + fibonnaciRecursive(position - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonnaciIterative(5));
        System.out.println(fibonnaciRecursive(5));
    }
}

