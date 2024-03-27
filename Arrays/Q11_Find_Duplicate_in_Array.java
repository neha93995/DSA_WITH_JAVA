// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.


public class Q11_Find_Duplicate_in_Array{

    //Timpe Complexity = O(n)
    // Space Complexity = O(n)

    public static int findDuplicate1(int arr[])
    {
        int a[] = new int[arr.length+1];


        for(int i=0; i<arr.length; i++)
        {
            int curr = arr[i];
            if(a[curr]>0)
            {
                return curr;
            }
            else{
                a[curr]  = a[curr]+1;
            }
        }
        return -1;
    }

    // Time Complexity = O(n)
    // Space Complexity =O(1)
    // With changing the original array

    public static int findDuplicate2(int arr[])
    {
        
        while(true)
        {   
            int temp = arr[0];
            arr[0] = arr[temp];
            arr[temp] = temp;
            if(arr[0]==arr[temp])
            {
                return arr[0];
            }
        }
        
    }

    // Time Complexity = O(n)
    // Space Complexity =O(1)
    // With changing the original array

    public static int findDuplicate3(int arr[])
    {

        for(int i=0; i<arr.length; i++)
        {
            int curr = Math.abs(arr[i]);
            if(arr[curr]<0)
            {
                return curr;
            }
            arr[curr] = arr[curr]*-1;

        }

        return -1;
    }


    // Time Complexity = O(n)
    // Space Complexity =O(1)
    // Without changing the original array

    public static int findDuplicate4(int arr[])
    {

        int duplicate = -1;

        for(int i=0; i<arr.length; i++)
        {
            int curr = Math.abs(arr[i]);
            if(arr[curr]<0)
            {
                duplicate = curr;
                break;
            }
            arr[curr] = arr[curr]*-1;

        }

        for(int i=0; i<arr.length; i++)
        {
            arr[i]  = Math.abs(arr[i]);
        }
        return -1;
    }


    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,1};

        
        System.out.println(findDuplicate2(arr));
    }
}