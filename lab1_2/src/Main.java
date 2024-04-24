public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(1, 3);
        Point p4 = new Point(3, 5);
        Point l1p1 = new Point(1, 2);
        Point l1p2 = new Point(3, 4);
        Point l2p1 = new Point(1, 3);
        Point l2p2 = new Point(3, 5);
        Line l1 = new Line(l1p1,l1p2);
        Line l2 = new Line(l2p1,l2p2);

        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p3: " + p3.toString());
        System.out.println("p4: " + p4.toString());
        System.out.println("l1: " + l1.toString());
        System.out.println("l2: " + l2.toString());

        p1.move(1,1);
        p2.move(1,1);
        p3.move(1,1);
        p4.move(1,1);
        l1.move(1,1);
        l2.move(1,1);

        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p3: " + p3.toString());
        System.out.println("p4: " + p4.toString());
        System.out.println("l1: " + l1.toString());
        System.out.println("l2: " + l2.toString());

        p1.flip();
        p2.flip();
        p3.flip();
        p4.flip();
        l1.flip();
        l2.flip();

        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p3: " + p3.toString());
        System.out.println("p4: " + p4.toString());
        System.out.println("l1: " + l1.toString());
        System.out.println("l2: " + l2.toString());
    }
}
