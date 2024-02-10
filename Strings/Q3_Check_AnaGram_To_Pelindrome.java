import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q3_Check_AnaGram_To_Pelindrome {

    // Time Complexity O(NlogN)
    // Space Complexity O(N)

    public static String isChangeToPelindrome(String s)
    {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        
        int singleElement =0;
        for(int i=0; i<ch.length; i++)
        {
            if(i<ch.length-1 && ch[i+1] == ch[i])
            {
                i++;
            }
            else{
                singleElement++;
            }   
        }
        if(singleElement<=1)
        {
            return "YES";
        }
        return "No";
    }

    // Time Complexity O(N)
    // Space Complexity O(N)

    public static String isChangeToPelindrome2(String s)
    {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c: s.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }

        System.out.println(map);
        int  singleElement = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()%2!=0 )
            {
                singleElement++;
            }
        }
        if(singleElement<=1)
        {
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        String s = "maadd";
        System.out.println(isChangeToPelindrome2(s));

    }
}
