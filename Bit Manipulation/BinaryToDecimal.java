public class BinaryToDecimal {

    static int binaryToDecimal(String s)
    {
        int dec = 0;
        int pow =0 ;

        for(int i=s.length()-1; i>=0; i--)
        {
            
            int a = Integer.parseInt(s.charAt(i)+"");


            dec = dec + (int)(a*Math.pow(2, pow++));

        }
        return dec;
    }

    static int binaryToDecimal2(String s)
    {
        int dec = 0;
        int pow =0 ;

        for(int i=s.length()-1; i>=0; i--)
        {
            
            if(s.charAt(i)=='1')
            {
                dec += pow;
            }
            pow = pow*2;

        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal("1111111111111111111111111111111"));
    }
}
