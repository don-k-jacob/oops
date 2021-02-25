public class StringReverse {
    public static void main(String[] args) {
        String rev="";
        String str="This is a test";
        int length=str.length();
        System.out.println("String : "+str);
        for(int i=length-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println("Reverse String : "+rev);
    }
}

  