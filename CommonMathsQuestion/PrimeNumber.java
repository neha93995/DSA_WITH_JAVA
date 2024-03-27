public class PrimeNumber {


    // Time Complexity O(N/2)
    public static boolean isPrime1(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }


    // Time Complexity O(root N)
    public static boolean isPrime2(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        if(n==2 || n==3)
        {
            return true;
        }
        if(n%2==0 || n%3==0)
        {
            return false;
        }
        for(int i=5; i*i<=n; i=i+6)
        {
            if(n%i==0 || n%(i+2)==0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime2(173));
        
    }
}
