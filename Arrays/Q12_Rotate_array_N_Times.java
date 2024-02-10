package Arrays;
import java.util.Arrays;

public class Q12_Rotate_array_N_Times {
    

    // Time Complexity = O(N)
    // Space Complexity =O(N)

    public static int[] rotateArray1(int n, int[]arr)
    {

        int a[] = new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            int newIndex = (i+n)%arr.length;
            a[newIndex] = arr[i];
        }
        return a;
    }


// Time Complexity = O(N)
// Space Complexity = O(N)

    public static int[] rotateArray2(int n, int[] arr)
    {
        int len = arr.length;
        reverse(arr, 0,len-1-n);
        reverse(arr, len-1-n+1, arr.length-1);
        reverse(arr, 0, arr.length-1);
        return arr;

    }

    public static int[] reverse(int arr[], int start, int end)
    {
        
       while(start<end)
       {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
       }
       return arr;

    }
    
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5,6,7};
        int k = 2;
        // System.out.println(Arrays.toString(rotateArray1(k,a)));
        System.out.println(Arrays.toString(rotateArray2(k,a)));
    }
}
