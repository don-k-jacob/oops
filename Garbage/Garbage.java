public class Garbage {

    static void print() {

        Garbage Check1 = new Garbage(); 
        disp();
    }

    static void disp() {
        Garbage Check2 = new Garbage();

    }

    public static void main(String[] args) {

        Garbage Set1 = new Garbage();
        Set1 = null; 

        System.gc();

        Garbage Set2 = new Garbage();
        Garbage Set3 = new Garbage();

        Set2 = Set3; 

        print(); 

    }

    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected Successfully");
    }
}