public class StringCount    
{  
    public static void main(String[] args) {    
        String text = "Hello World";    
        int c = 0;    
        for(int i = 0; i < text.length(); i++) {
            if (text.charAt(i)=='l') 
                c++;
        }
        System.out.println("Frequency of 'l': " + c);    
    }    
}    