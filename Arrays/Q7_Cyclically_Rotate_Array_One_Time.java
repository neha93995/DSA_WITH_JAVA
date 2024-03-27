import java.util.Arrays;

public class Q7_Cyclically_Rotate_Array_One_Time {
 
    
    //  Time Complexity O(n)
    // Space Complexity  O(1)

    public static void rotate(int arr[])
    {
        
        int last = arr[arr.length-1];

        for(int i=arr.length-1; i>0;  i--)
        {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        arr[0] = last;

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8};

        rotate(arr);
    }
}
