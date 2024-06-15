public class CountNumberOfDigits {

    // Time Complexity O(totalDigits) = O(N)
    public static int countNumberOfDigits(int n)
    {
        int count =0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumberOfDigits(1223334140));
    }
}
