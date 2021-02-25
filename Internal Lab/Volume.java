public class Volume {
    static double comparer(double cube_vol, double sphere_vol) {
        if (cube_vol < sphere_vol) {
            return 1;
        } else if (cube_vol == sphere_vol) {
            return 0;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        cube c = new cube(10);
        sphere s = new sphere(10);
        double cube_vol = 5;
        double sphere_vol = 6;
        double value = comparer(cube_vol, sphere_vol);
        System.out.println(value);
    }

}

class cube {
    private double side;

    cube(double sides) {
        side = sides;
    }

    public double getVolume() {
        double volume = side * side * side;
        return volume;
    }
}

class sphere {
    private int radius;

    sphere(int rad) {
        radius = rad;
    }

    public double getVolume() {
        double volume = ((4 / 3) * 3.14 * radius * radius * radius);
        return volume;
    }
}