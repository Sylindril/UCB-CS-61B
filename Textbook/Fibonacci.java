public class Fibonacci{
    public static int fib(int n){
        if (n <= 1){
            return n;
        } else{
            return fib(n-1) + fib(n-2);
        }

    }
    public static int fib2(int n, int k, int f0, int f1){
        if(n!=0){
            return fib2(n-1, k, f1, f0 + f1);
        } else{
            return f0;
        }
//       if (n==k){
//           return f0;
//       } else {
//           return fib2(n, k+1, f1, f0 + f1);
//       }
    }
    public static void main(String[] args){
        System.out.println(fib(9));
        int k = 0;
        System.out.println(fib2(9, k, 0, 1));
    }

}