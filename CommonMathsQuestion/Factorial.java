public class Factorial {

    // time Complexity O(N)
    // Space Complexity O(1)
    public static int factorial1(int n)
    {
        int fact=1;
        for(int i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        return fact;
    }

    // Time Complexity O(N)
    // Space Complexity O(N)

    public static int factorial2(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*factorial2(n-1);
    }
    public static void main(String[] args) {
        
        System.out.println(factorial1(0));
        System.out.println(factorial2(0));
    }
}
