import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int a = sc.nextInt();
        System.out.println("Enter num : ");
        int b = sc.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);        
    }
}
