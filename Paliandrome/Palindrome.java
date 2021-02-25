public class Palindrome
{
    public static void main(String args[]){
        String a, b = "";
        a = "malayalam";
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
            b = b + a.charAt(i);
        if(a.equalsIgnoreCase(b))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
    }
} 