public class SumOfAllDigis {
 
    static int sumOfAllDigis(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int rem = n%10;
        return sumOfAllDigis(n/10)+rem;
    }
 
    public static void main(String[] args) {
    
        System.out.println(sumOfAllDigis(1234));
 }   
}
