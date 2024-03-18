import java.util.Scanner;

public record Test() {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("enter");
        int i = s.nextInt();
     double d = s.nextDouble();
         String str = s.nextLine();


         System.out.println(i);
         System.out.println(d);
         System.out.println(str);

    }
}
