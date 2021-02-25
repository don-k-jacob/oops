public class StringByteArray {
    public static void main(String[] args) {
        String str = "java";
        byte[] byteArray = str.getBytes();
        for (int i = 0; i < byteArray.length; i++)
            System.out.print(byteArray[i] + ",");
    }
}