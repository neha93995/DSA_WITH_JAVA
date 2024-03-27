public class HCF{

    // Bruitforce Appraoch
    // Time Complexity = O(N)
    static int highestCommonFactor1(int a, int b)
    {
        int maxNum = 0;
        if(a<=b)
        {
            maxNum =b;
        }
        else{
            maxNum =a;
        }

        while(maxNum>1)
        {
            if(a%maxNum==0 && b%maxNum==0 )
            {
                return maxNum;
            }
            maxNum--;
        }

        return 1;
    }


    // Euclid's Algorithm
    // Time Complexity O(max(a,b))

    static int highestCommonFactor2(int a, int b)
    {

        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else{
                b=b-a;
            }
        }

        return a;
    }

    // Gabrial algorith or optimised Euclid's algorithm
    // time Complexity = O(log(min(a,b)))
    
    static int highestCommonFactor3(int a, int b)
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

        System.out.println(highestCommonFactor3(8, 10));
        
    }
}

