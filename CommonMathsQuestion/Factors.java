public class Factors {

    // Time Complexity O(root N)
    public static void findFactors(int n)
    {
        for(int i=1; i*i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.print("["+i+" , "+n/i+"] \n");
            }
        }
    }

    public static void main(String[] args) {
        findFactors(40);
    }
}
