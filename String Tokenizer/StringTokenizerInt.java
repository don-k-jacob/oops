import java.util.*;

public class StringTokenizerInt {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Numbers : ");
        string = scanner.nextLine();
        int sum = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(string);
        while (stringTokenizer.hasMoreTokens()) {
            int i;
            i = Integer.parseInt(stringTokenizer.nextToken());
            System.out.print(i+ "\t");
            sum = sum + i;
        }
        System.out.println("\nSUM : " + sum);
    }
}