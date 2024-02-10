package Arrays;
import java.util.Arrays;

public class Q9_Mimimum_Maximum_Difference {
    
    public static int getMinDiff(int[] arr, int n, int k) {
        
        Arrays.sort(arr);
        
        int ans = arr[n-1] - arr[0];
        int smallest = arr[0] +k ; 
        int largest = arr[n-1]-k ;
        int min=0 , max=Integer.MAX_VALUE ;

        for(int i=0 ; i<n-1 ; i++)
        {
        
            min = Math.min(smallest , arr[i+1]-k);
            max = Math.max(largest , arr[i]+k);

            if(min < 0)
                continue ;
            ans  = Math.min(ans , max - min);
        }
        System.out.println("min "+ min);
        System.out.println("max "+ max);
        return ans ;
    }
    public static void main(String[] args) {

        int arr[] = {1, 8, 10, 6, 4, 6, 9, 1};
        
        System.out.println(getMinDiff(arr,arr.length,7));
    }
}
