public class cuboid {
    public static void main(String args[]) {
        float l, w, h, surfacearea;

        l = 2;
        w = 3;
        h = 5;
        surfacearea = 2*( l*w + w*h + h*1 );
        System.out.println("Surface area of the cuboid is: ");
        System.out.println(surfacearea);
    }
}