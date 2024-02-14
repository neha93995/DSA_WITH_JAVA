public class Q5_Check_Pangram {


    // Time Complexity O(N^2) // because of indexOf method
    // Space Complexity O(1);
    public  static boolean checkIfPangram(String s) {

        if(s.length()<26)
        {
            return false;
        }

        s = s.toLowerCase();

        for(char ch='a'; ch<='z'; ch++)
        {
            if(!(s.indexOf(ch)>=0))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        String s = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(s));

    }
}
