package Arrays;
import java.util.Arrays;

public class Q4_Sort_0_1_2_Array {

    // Time Complexity = O(n)
    // Space Complexity = O(1)
    public static void sort(int arr[])
    {
        int i=0;
        int left=0;
        int right=arr.length-1;

        while(i<=right)
        {
            if(arr[i]==2)
            {
                int temp = arr[i];
                arr[i] =arr[right];
                arr[right] = temp;
                right--;
            }
            else if(arr[i]==0)
            {
                int temp = arr[i];
                arr[i]= arr[left];
                arr[left] = temp;
                left++;
                i++;
            }
            else{
                i++;
            }
            System.out.println(Arrays.toString(arr)+ " "+ left+" "+right+" "+i);

        }

        
        
    }
    public static void main(String[] args) {
        
        int arr[] = {2,0,2,1,1,0};
        sort(arr);

    }
}
