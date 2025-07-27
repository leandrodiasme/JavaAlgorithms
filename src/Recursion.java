public class Recursion {

    static int factorialIterative(int n){
        int result = 1;
        for(int i=n;i>0;i--){
           result *= i;
        }
        return result;
    }

    static int factorialRecursive(int n){
        if(n == 0){
           return 1;
        }
        return n * factorialRecursive(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorialIterative(5));
        System.out.println(factorialRecursive(5));
    }
}

