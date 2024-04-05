public class JosephusKillingProblem {

    // Time Complexity O(N)
    // Space Complexity O(N)
    
    static int josephusKillingProblem(int n, int k)
    {
        if(n==0) return 0;

        return (josephusKillingProblem(n-1, k)+k)%n;
    }
    public static void main(String[] args) {

        // kth element will eleminated 
        // 0,1,2,3,4,5  // 2 is killed and counting started frin 3
        // 3,4,5,0,1    // 5 is killed and counting started from 0
        // 0,1,3,4      // 3 is  killed and counting started from 4
        // 4,0,1        // 1 is killed and  counting started from 4
        // 4,0          // 4 is killed and the last save element is 0
         // 0

        System.out.println(josephusKillingProblem(6, 3));
    }
}
