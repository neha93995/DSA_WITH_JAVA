public class SubSequenceOfString {

    static void subSequence(String s, String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }

        // pick
        subSequence(s.substring(1), ans+s.charAt(0));
        // not pick
        subSequence(s.substring(1), ans);
    }

    public static void main(String[] args) {
        
        subSequence("abc","");
    }
}
