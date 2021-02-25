import java.util.Scanner;

public class Midpoint{

    static boolean hasMidpoint(int a, int b, int c) {
        if (a + b == 2 * c)
            return true;
        else if (c + b == 2 * a)
            return true;
        else if (c + a == 2 * b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        int a, b, c;
        boolean output;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 3 integers : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        output=hasMidpoint(a, b, c);

        System.out.println("Output : "+output);
    }
}