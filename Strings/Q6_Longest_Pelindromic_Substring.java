
interface Hello{
    static void say(){
        System.out.println("static method inside the interface");
    }
    static void saysay(){
        System.out.println("sdfalskdjfaljsdkf");
    }
    default void bye()
    {
        System.out.println("bye bye");
    }
}

class A{
    final void finalMethod()
    {
        System.out.println("Final method");
    } 
}

class B extends A{
    final void finalSubClassMethod()
    {
        System.out.println("Final sub class method");
    }
}


public class Q6_Longest_Pelindromic_Substring implements Hello {


    Q6_Longest_Pelindromic_Substring()
    {
        System.out.println("Hello");
        int a = 10;
        if(a==1)
        {
            return ;
            
        }
        
        System.out.println("Hello");
    }

    public  String longestPelindromicSubString(String s)
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

    final public static void main(String[] args) {
        
        Q6_Longest_Pelindromic_Substring  asdf = new Q6_Longest_Pelindromic_Substring ();

        String s = "madam";
        Object obj = new Object();
        Hello.say();
        Hello.saysay();
        asdf.bye();
        B b = new B();
        b.finalMethod();
        b.finalSubClassMethod();;
        // System.out.println(longestPelindromicSubString(s));
    }
}

