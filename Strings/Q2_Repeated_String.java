public class Q2_Repeated_String {
    
    public static int repeatedString(String s, int n)
    {

        if(s.length()==1)
        {
            return n;
        }
        for(int i=0; i<=n/s.length(); i++)
        {
            s += s;
        }

        int count =0;
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i)=='a')
            {
                count++;
            }
        }
        return count;
    }

    public static int repeatedString2(String s, int n)
    {
        int repeat = n/s.length();
        int count =0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a')
            {
                count++;
            }
        }
        int res = repeat*count;

        for(int i=0; i<n-(repeat*s.length()); i++)
        {
            if(s.charAt(i)=='a')
            {
                res++;
            }
        }

        return res;


    }
    public static void main(String[] args) {
        String s = "aba";
        int n =10;
        System.out.println(repeatedString2(s,n));
    }
}
