public class NonRepeatingString {

    public static int frequency(char c, String s) {
        int i, flag = 0;
        for (i = 0; i < s.length(); i++) {
            if (c == s.charAt(i))
                flag++;
        }
        return flag;
    }

    public static void main(String args[]) {
        String s = "assassination";
        System.out.println("String : " + s);
        System.out.print("Non Repeating Chars : ");
        int freq[] = new int[s.length()];
        int i;
        for (i = 0; i < s.length(); i++) {
            freq[i] = frequency(s.charAt(i), s);
        }
        for (i = 0; i < s.length(); i++) {
            if (freq[i] == 1) {
                System.out.print(s.charAt(i) + "\t");
            }
        }
    }
}
