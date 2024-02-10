package Arrays;
import java.util.Arrays;

public class Q5_Move_Negative_End {
    
    // Time Complexity = O(n)
    // Space Complexity = O(n)
    // when order is maintained
    public static void arrangeInOrder(int arr[], int n)
    {
        
        int arr2[] = new int[n];
        int count= 0;
        
        for(int i=0; i<n; i++)
        {
            if(arr[i]<0)
            {
                count++;
            }
        }
        
        int pos=0;
        int neg =n-count;
        
        for(int i= 0; i<n; i++)
        {
            if(arr[i]>=0)
            {
                arr2[pos] = arr[i];
                pos++;
            }
            else
            {
                arr2[neg] = arr[i];
                neg++;
            }
        }
        
       System.out.println(Arrays.toString(arr2));
    }


    // Time Complexity =O(n)
    // Space Complexity = O(1)
    // without maintain order
    public static void arrangeWithoutOrder(int arr[], int n)
    {
        int i=0; 
        for(int k=0; k<n; k++)
        {
            
            if(arr[k]>=0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
            }
            System.out.println(Arrays.toString(arr));
            
        }

    }


    public static void main(String[] args) {
        
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        // arrangeInOrder(arr, arr.length);
        arrangeWithoutOrder(arr, arr.length);

    

    }
}
