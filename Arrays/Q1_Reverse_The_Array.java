package Arrays;
import java.util.Arrays;

public class Q1_Reverse_The_Array{


    // Time Complexity = O(n)
    // Space Complexity = O(n)
    public static void reverse1(int arr[])
    {
        int n = arr.length;
        int newArr[] = new int[n];

        for(int i=n-1; i>=0; i--)
        {
            newArr[n-i-1] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));

    }


    // two pointer approach 
    // Time Complexity = O(n)
    // Space Complexity = O(1)
    public static void reverse2(int arr[])
    {
        int i=0;
        int j = arr.length-1;

        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;

            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        
        int arr[] = {9,8,7,6,5,4,3,2,1};
        reverse1(arr); // changes not refelected in arr because we use an extra array in the reverse1 method
        reverse2(arr); // change will occure in arr because we use the same array in the reverse2 method

    }
}