public class Q8_Maximum_Sum_OF_SubArray{

    // Time Complexity = O(n)
    // Space Complexity = O(1)
    
    public static void maximumSubArray(int arr[])
    {
        int sum = 0;
        int max = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];

            if(sum>max)
            {
                max = sum;
            }
            if(sum<0)
            {
                sum =0;
            }
        }

        System.out.println("Maximum Sum of SubArray : "+max);
    }

    public static void main(String[] args) {
        
        int arr[] = {2,1,-2,1,-3,4,-1,2,-5,4};

        maximumSubArray(arr);
    }
}