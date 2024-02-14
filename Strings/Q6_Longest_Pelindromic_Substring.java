public class Q6_Longest_Pelindromic_Substring {

    public static String longestPelindromicSubString(String s)
    {

        String res="";
        for(int i=0; i<s.length(); i++)
        {
            String temp= "";
            for(int j=i;j<s.length(); j++)
            {
                temp += s.charAt(j);

                if(isPelindromic(temp))
                {
                    if(res.length()<temp.length())
                    {
                        res = temp;
                    }
                }
            }
        }

        return res;
    }

    public static boolean isPelindromic(String s)
    {
        int i=0, j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(longestPelindromicSubString(s));
    }
}
