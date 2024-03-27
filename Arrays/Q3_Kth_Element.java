import java.util.Arrays;

public class Q3_Kth_Element{

    // Time Complexity O(N^2)
    // space Complexity O(1)

    public static int kth_Max_Element(int arr[], int k)
    {
        System.out.println(Arrays.toString(arr));

        int max=0;
        while(k>0)
        {
            max = Integer.MIN_VALUE;
            int index = 0;

            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]>max)
                {
                    max = arr[i];
                    index = i;
                    
                }
                
            }
            arr[index]=Integer.MIN_VALUE;
            k = k-1;
        }

        return max;
    }
    public static int kth_Min_Element(int arr[], int k)
    {
        System.out.println(Arrays.toString(arr));
        int min=0;
        while(k>0)
        {
            min = Integer.MAX_VALUE;
            int index = 0;

            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]<min)
                {
                    min = arr[i];
                    index = i;
                    
                }
                
            }
            arr[index]=Integer.MAX_VALUE;
            k = k-1;
        }

        return min;
    }
    public static void main(String[] args) {
     
        int arr1[] = {1,3,4,5,6,7,82,934,10};
        int k1 = 3;
        int min = kth_Min_Element(arr1, k1);

        int arr2[] = {1,3,4,5,6,7,82,934,10};
        int k2 = 3;
        int max = kth_Max_Element(arr2, k2);
        System.out.println("Min : "+min);
        System.out.println("Max : "+max);

    }
}