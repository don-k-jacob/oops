public class ExceptionHandling extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        int a = 0, b = 0, c = 0;
        try {
            a = 256;
            b = 0;
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("!!!DIVISION BY ZERO!!!");
        } finally {
            System.out.println("!!Exception Handled Sucessfully!!");
        }
        thread.sleep(1000);
    }

}
