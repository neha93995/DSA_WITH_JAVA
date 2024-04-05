public class ReverseString {

    static String reverseString(String str, int n, String ans )
    {
        if(n<0)
        {
            return ans;
        }
        return reverseString(str, n-1, ans+str.charAt(n));
    }

    public static void main(String[] args) {
        String s = "Neha";
        System.out.println(reverseString(s, s.length()-1, ""));
    }   
}
