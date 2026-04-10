package shapes;

public class TestShapes {

    public static void main(String[] args) {

        shape3d s1 = new cylinder(3,5);
        shape3d s2 = new sphere(4);
        shape3d s3 = new cube(2);

        System.out.println(s1.volume());
        System.out.println(s2.volume());
        System.out.println(s3.volume());
    }
}