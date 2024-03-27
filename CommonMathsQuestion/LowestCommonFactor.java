public class LowestCommonFactor {

    // Time Complexity O(m*n);

    public static int LCM1(int a, int b)
    {
        int max =0;
        if(a>b)
        {
            max=a;
        }
        else{
            max=b;
        }

        for(int i=max; i<=a*b; i++)
        {

            if(a%i==0 && a%i==0)
            {
                return i;
            }
        }
        return max;
    }

    // Time Complexity = O(log(min(a,b)))
    public static int LCM2(int a, int b)
    {
        return (a*b)/HCF(a,b);
    }


    static int HCF(int a, int b)
    {

        while(a!=0 && b!=0)
        {
            if(a>b)
            {
                a=a%b;
            }
            else{
                b=b%a;
            }
        }

        return Math.max(a, b);
    }
    public static void main(String[] args) {

        System.out.println(LCM1(10,30));
    }
}
