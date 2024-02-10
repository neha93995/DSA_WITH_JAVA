package Arrays;
public class Q14_Find_Maximum_Sum_SubArray{

    public static int findSubArray(int []a)
    {

        int sum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++)
        {
            sum += a[i];
            if(sum>maxSum)
            {
                maxSum = sum;
            }
            if(sum<0)
            {
                sum =0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int a[] = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10 };
        System.out.println(findSubArray(a));

        
    }
}