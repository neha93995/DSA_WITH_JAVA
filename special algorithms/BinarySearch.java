public class BinarySearch{

    // iterative apprach
    // Time Complexity O(log n)
    // space Complexity O(1)

    public static int binarySearch(int arr[], int target)
    {
        int i=0; 
        int j=arr.length-1;
        int mid =0;


        while(i<=j)
        {
            mid = (i+j)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return -1;
    }


    // recursive approach
    // time Complexity O(log n)
    // space complexity O(log n)
    public static int binarySearch2(int arr[], int target, int left, int right)
    {
        int mid = (left+right)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[mid]>target)
        {
            return binarySearch2(arr, target, left, mid-1);
        }
        else{
            return binarySearch2(arr, target, mid+1, right);
        }


    }

    public static void main(String[] args) {
        int result = binarySearch(new int[]{1,2,3,4,5,6,7}, 4);
        System.out.println(result);
    }
}