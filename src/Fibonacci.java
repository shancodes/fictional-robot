public class Fibonacci {

    public void findFib(int n){
        if (n<1)
            return;
        int[] fib = new int[n];
        fib[0] = 0; fib[1] = 1;
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for(int m : fib){
            System.out.println(m);
        }

        //return n < 1 ? n : findFib(n -1) + findFib(n -2);

    }
}
