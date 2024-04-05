import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;


public class Q15_Count_Duplicate_Element{

    // aaplicable when duplicates elements are not more then 2 
    // Time Complexity O(NlogN)
    static int countDuplicates(int arr[])
    {
        Arrays.sort(arr);
        int count=0;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]==arr[i+1] )
            {
                count++;
            }
        }
        return count;
    }

    // Time Complexity O(NlogN)
    static int countDuplicates2(int arr[])
    {
        Arrays.sort(arr);
        int count=0;
        int lastElement = -1;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]==arr[i+1] && lastElement!=arr[i])
            {
                count++;
                lastElement=arr[i];
            }
        }
        return count;
    }

    // Time Complexity O(N)
    // Space Complexity O(N)
    static int countDuplicates3(int arr[])
    {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            hashMap.put(arr[i] , hashMap.getOrDefault(arr[i],0)+1);
        }

        Set<Integer> keySet = hashMap.keySet();
        int count=0;
        for(Integer key : keySet)
        {
            if(hashMap.get(key)>1)
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
         System.out.println(countDuplicates(new int[]{1,2,3,4,5,6,7,6,6}));
         System.out.println(countDuplicates2(new int[]{1,1,2,3,4,5,6,6,6,7,8,9,10,10}));
         System.out.println(countDuplicates3(new int[]{1,1,2,3,4,5,6,6,6,7,8,9,10,10}));
    }
}