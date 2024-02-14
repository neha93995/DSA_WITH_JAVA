import java.sql.Time;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Q4_Check_Anagram_String {

    // Best 
//     Time Complexity = O(NlogN)
//     Space Complexity =O(2*N) = O(N)

      public static boolean isAnagram1(String s, String t) {
        
        if(s.length() != t.length())
        {
            return false;
        }

        s = s.toLowerCase();
        t = t.toLowerCase();

        char[] srr = s.toCharArray();
        char[] trr = t.toCharArray();

        Arrays.sort(srr);
        Arrays.sort(trr);

        s = Arrays.toString(srr);
        t = Arrays.toString(trr);

        if(s.equals(t))
        {
            return true;
        }
        else{
            return false;
        }

    }

    // Worst
    // Time Complexity = O(N^2)


    public static boolean isAnagram2(String s, String t)
    {

        if(s.length() != t.length())
        {
            return false;
        }


        s = s.toLowerCase();
        t = t.toLowerCase();

        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if(t.indexOf(ch)>=0)
            {
                t=t.replaceFirst(ch+"","");
            }else{
                return false;
            }
        }

        if(t.isEmpty())
        {
            return true;
        }

        return false;
    }


    // Worst
    
    public static boolean isAnagram3(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        s = s.toLowerCase();
        t = t.toLowerCase();

        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
    
            map.put(ch, map.getOrDefault(ch,0)+1);
            
        }

        for(int i=0; i<s.length(); i++)
        {
            char ch = t.charAt(i);
    
            map.put(ch, map.getOrDefault(ch,0)-1);
            
        }

       Set<Character> entry = map.keySet();

       for(Character ch : entry)
       {
            if(map.get(ch)!=0)
            {
                return false;
            }
       }

        return true;

    }
 public static void main(String[] args) {

    String s = "anagram";
    String t = "maaangr";

    System.out.println(isAnagram3(s,t));
 }   
}
