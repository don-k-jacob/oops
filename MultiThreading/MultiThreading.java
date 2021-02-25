import java.util.Random;
import java.util.*;

class Number extends Thread {
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int random_int = random.nextInt(100);
            SquareCube(random_int);
        }

    }

    void SquareCube(int random_int) {
        System.out.println("Random Integer:" + random_int);
        if (random_int % 2 == 0) {
            try {
                Square s = new Square(random_int);
                s.start();
                s.join();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else {
            try {
                Cube c = new Cube(random_int);
                c.start();
                c.join();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
};

class Square extends Thread {
    int x;

    Square(int n) {
        x = n;
    }

    public void run() {
        int sqr = x * x;
        System.out.println("Square of " + x + " = " + sqr + "\n");
    }

};

class Cube extends Thread {
    int x;

    Cube(int n) {
        x = n;
    }

    public void run() {
        int cbe = x * x * x;
        System.out.println("Cube of " + x + " = " + cbe + "\n");
    }

};

public class MultiThreading {
    public static void main(String[] args) {

        Number n = new Number();
        n.start();
    }
}
