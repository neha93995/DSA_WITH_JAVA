public class Fibonacci {
    

    // Time Complexity O(2^n) 
    // Space Complexity O(n)  
    // not good for large number  

    static int fibonacci(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int s = fibonacci(n-1)+fibonacci(n-2);
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonacci(n-1));
    }
}
