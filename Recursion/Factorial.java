public class Factorial{


    // Time Complexity O(N)
    // Space Complexity O(N)
    
    static int factorial(int n)
    {
        if(n==1) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        
        System.out.println(factorial(5));
    }
}