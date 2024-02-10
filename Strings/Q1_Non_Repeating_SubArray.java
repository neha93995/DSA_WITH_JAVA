public class Q1_Non_Repeating_SubArray{

    public static StringBuffer NotRepeatingSubString(String s)
    {
        char ch[] = s.toCharArray();
        StringBuffer maxSubString =new StringBuffer();
        StringBuffer result = new StringBuffer();
        

        int i=0, j=0;
        while(i<ch.length)
        {
            maxSubString.append(ch[i]);

            if(i<ch.length-1 && maxSubString.indexOf(Character.toString(ch[i+1])) !=-1)
            {
                j++;
                i=j;
                if(maxSubString.length()>result.length())
                {
                    result = maxSubString;
                }
                maxSubString= new StringBuffer();
            }
            else{
                i++;

            }
        }

        return result;
    }


    public static String maxSubString(String s)
    {
        String result ="";
        
        for(int i=0; i<s.length(); i++)
        {
            String temp ="";
            for(int j=i; j<s.length(); j++)
            {
                if(!temp.contains(s.charAt(j)+""))
                {
                    temp += s.charAt(j);
                }
                else 
                {
                    break;
                }
            }
            if(result.length()<temp.length())
            {
                result =temp;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
        String s = "tapabcdefab";
        // System.out.println(NotRepeatingSubString(s));
        System.out.println("------------- "+maxSubString(s));
    }
}