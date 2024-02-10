package Arrays;
public class Q2_Max_Min_Element_In_Array{

    public static void min_max(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(max<=arr[i])
            {
                max = arr[i];
            }
            if(min>=arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("min : "+ min);
        System.out.println("max : "+max);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,745,8,9};
        min_max(arr);


    }
}