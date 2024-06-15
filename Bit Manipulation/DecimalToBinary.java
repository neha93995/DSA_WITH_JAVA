public class DecimalToBinary {

    static StringBuilder decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            int remender = n % 2;
            n = n / 2;
            binary.insert(0, remender);
        }

        return binary;

    }

    static String decimalToBinary2(int number) {
        String s = "";

        // 4 bit representation

        for (int i = 31; i >= 0; i--) {
            int bit = (number >> i) & 1;
            s = s + bit;
        }
        return s;
    }

    public static long reverseBits(long n) {
        long N=0;
        String s = "";

        // decimal to binary
        int i = 1;
        while (i <= 32) {
            if (n > 0) {
                long rem = n % 2;
                s =s+rem;
                n /= 2;
            } else {
                s =s+"0";
            }
            i++;
        }
        return binaryToDecimal(s);

    }

    static long binaryToDecimal(String s)
    {
        long dec = 0;
        long pow =0 ;

        for(int i=s.length()-1; i>=0; i--)
        {
            
            long a = Integer.parseInt(s.charAt(i)+"");


            dec = dec + (int)(a*Math.pow(2, pow++));

        }
        return dec;
    }

    public static void main(String[] args) {

        // System.out.println(decimalToBinary(3));
        // System.out.println(decimalToBinary2(5));
        System.out.println(reverseBits(3));
    }
}