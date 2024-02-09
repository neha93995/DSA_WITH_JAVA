import java.util.Arrays;

public class Q13_Merge_Two_Array_In_Sorted_Manner {

    // With Extra Space
    // Time Complexity O(N)
    // Space Complexity O(N)

    public static int[] mergeTwoArrayWithExtraSpace(int a[], int b[])
    {
        int res[] = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length || j<b.length)
        {
            if(i<a.length && j<b.length)
            {
                if(a[i]<b[j])
                {
                    res[k++] = a[i++];
                }
                else{
                    res[k++] = b[j++];
                }
            }
            else if(i<a.length)
            {
                res[k++] =a[i++];
            }
            else
            {
                res[k++] = b[j++];
            }
        }
        return res;
    }

    // Wtihout extra space 
    // Time Complexity O(N^2)
    // Space Complexity O(1)

    public static void mergeTwoArrayWithoutExtraSpace(int a[] , int b[])
    {

        for(int i=0; i<a.length; i++)
        {
            if(a[i]>b[0])
            {
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;
            }

            for(int j=1; j<b.length; j++)
            {
                if(b[j-1]>b[j])
                {
                    int temp = b[j-1];
                    b[j-1] = b[j];
                    b[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }

    public static void main(String[] args) {
        
        int a[] = {1,3,5,7,8,9,10};
        int b[] = {2,4,6};

        
        // System.out.println(Arrays.toString(mergeTwoArrayWithExtraSpace(a, b)));
        mergeTwoArrayWithoutExtraSpace(a, b);
    }
}
