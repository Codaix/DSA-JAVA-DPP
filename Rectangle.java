public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int calculateArea() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.display();

        Rectangle r2 = new Rectangle(10, 5);
        r2.display();
    }
}


