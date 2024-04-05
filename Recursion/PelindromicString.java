public class PelindromicString {
    static boolean isPelindromic(String s , int i, int j)
    {
        System.out.println(i+" "+j+" "+s.charAt(i)+" "+s.charAt(j));
        if(i>=j)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }
        return isPelindromic(s, i+1,j-1);
    }

    public static void main(String[] args) {
        String s = "maddaaam";
        System.out.println(isPelindromic(s,0,s.length()-1));
    }
}
