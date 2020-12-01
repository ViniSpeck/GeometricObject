public class CircleTest {
    public static void main(String[] args) {
        ResizableCircle c1 = new ResizableCircle(3);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        c1.resize(30);
        System.out.println(c1);
        c1.resize(300);
        System.out.println(c1);
    }
}
