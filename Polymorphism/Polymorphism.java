abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {

    void numberOfSides() {
        System.out.println("Number of sides of rectangle is 4");
    }
}

class Triangle extends Shape {

    void numberOfSides() {
        System.out.println("Number of sides of triangle is 3");
    }
}

class Hexagon extends Shape {

    void numberOfSides() {
        System.out.println("Number of sides of hexagon is 6");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Shape obj;
        
        obj = new Rectangle();
        obj.numberOfSides();

        obj = new Triangle();
        obj.numberOfSides();

        obj = new Hexagon();
        obj.numberOfSides();
    }
}