import java.util.HashMap;
import java.util.Set;

public class Q7_Minimum_Character_Add_To_make_Pelindrome {
    
    
    public static int minimumCharacter(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int count = 0;

        Set<Character> keys = map.keySet();

        for(Character key : keys)
        {
            if(map.get(key)%2!=0)
            {
                count++;
            }
        }

        if(keys.size()%2==0)
        {
            return count-1;
        }
        else{
            return count;
        }

    }
    public static void main(String[] args) {
        String s = "zjveiiwvc";
        System.out.println(minimumCharacter(s));
    }
}
