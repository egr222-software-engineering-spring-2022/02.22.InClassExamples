public class Main {

    public static void main(String[] args) {
	    Point p1 = new Point();
	    p1.y = 2;
	    Point p2 = new Point();
	    p2.x = 4;

	    System.out.println(p1.x + ", " + p1.y); // 0, 2

        // move p2 and then print it
		p2.x += 2;
		p2.y++;

		System.out.println(p2.x + ", " + p2.y); // 6, 1
    }
}
