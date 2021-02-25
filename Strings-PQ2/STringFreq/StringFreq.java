public class StringFreq {
    public static int frequency(char c, String s) {
        int i, flag = 0;
        for (i = 0; i < s.length(); i++) {
            if (c == s.charAt(i))

                flag++;
        }
        return flag;
    }

    public static int largest(int freq[], int size, int limit) {
        int i, flag = 0;
        for (i = 0; i < size; i++) {
            if ((freq[i] > flag) && (freq[i] < limit)) {
                flag = freq[i];
            }
        }
        return flag;
    }

    public static void main(String args[]) {
        String s = "assassination";
        System.out.println("String : " + s);
        System.out.print("Second Frequent Characters : ");
        int size = s.length();
        int freq[] = new int[size];
        int i, j, most, scndmost;
        for (i = 0; i < size; i++) {
            freq[i] = frequency(s.charAt(i), s);
        }
        most = largest(freq, size, size);
        scndmost = largest(freq, size, most);
        for (i = 0; i < size; i++) {
            if (freq[i] == scndmost) {
                for (j = (i + 1); j < size; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        freq[j] = 0;
                    }
                }
            }
        }
        for (i = 0; i < size; i++) {
            if (freq[i] == scndmost)
                System.out.print(s.charAt(i) + " ");
        }
    }
}