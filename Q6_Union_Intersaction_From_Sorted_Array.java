import java.util.ArrayList;

public class Q6_Union_Intersaction_From_Sorted_Array {
    

    // Time Complexity O(n)
    
    public static void union(int arr1[], int arr2[])
    {
        ArrayList<Integer> a = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length )
        {
            if(arr1[i]==arr2[j])
            {
                a.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                i++;
            }
            else{
                j++;
            }
        }

        System.out.println(a);
        
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7};
        int arr2[] = {1,2,5,6};
        
        // find max length array  and send it as a first perameter
        if(arr1.length>arr2.length)
        {
            union(arr1, arr2);
        }
        else{
            union(arr2, arr1);
        }

    }
}
