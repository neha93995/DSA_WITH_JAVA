public class DecimalToBinary{

    static StringBuilder decimalToBinary(int n)
    {
        StringBuilder binary = new StringBuilder();

        while(n>0)
        {
            int remender = n%2;
            n = n/2;
            binary.insert(0, remender);
        }

        
        return binary;

    }

    static String decimalToBinary2(int number)
    {
        String s="";

        // 4 bit representation
        
        for (int i = 31; i >= 0; i--) {
            int bit = (number >> i) & 1;
            s=s+bit;
        }
        return s;
    }

    public static void main(String[] args) {
        
        System.out.println(decimalToBinary(3));
        System.out.println(decimalToBinary2(5));
    }
}