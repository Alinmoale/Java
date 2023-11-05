public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculateArea() {
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 8.0);

        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}