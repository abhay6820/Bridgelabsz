import java.util.Scanner;

// UC 4: Point class representing a point with (x, y) coordinates
class Point {
    private double x;
    private double y;

    // Constructor to initialize the point with given coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter method for x coordinate
    public double getX() {
        return x;
    }

    // Getter method for y coordinate
    public double getY() {
        return y;
    }
}

// UC 4: Line class representing a line based on two points
class Line {
    private Point startPoint;
    private Point endPoint;

    // Constructor to initialize the line with two points
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // UC 1: Method to calculate the length of the line
    public double calculateLength() {
        double x1 = startPoint.getX();
        double y1 = startPoint.getY();
        double x2 = endPoint.getX();
        double y2 = endPoint.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // UC 2: Method to check equality of two lines
    public boolean equals(Line otherLine) {
        return this.calculateLength() == otherLine.calculateLength();
    }

    // UC 3: Method to compare two lines
    public int compareTo(Line otherLine) {
        double length1 = this.calculateLength();
        double length2 = otherLine.calculateLength();

        // Using compareTo method to compare lengths
        return Double.compare(length1, length2);
    }
}

 class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        // UC 4: Creating points and lines
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);
        Line line1 = new Line(point1, point2);

        Point point3 = new Point(3, 5);
        Point point4 = new Point(7, 9);
        Line line2 = new Line(point3, point4);

        // UC 1: Calculating and displaying lengths of lines
        System.out.println("Length of Line 1: " + line1.calculateLength());
        System.out.println("Length of Line 2: " + line2.calculateLength());

        // UC 2: Checking equality of lines
        if (line1.equals(line2)) {
            System.out.println("Line 1 is equal to Line 2");
        } else {
            System.out.println("Line 1 is not equal to Line 2");
        }

        // UC 3: Comparing lines
        int result = line1.compareTo(line2);
        if (result == 0) {
            System.out.println("Line 1 is equal to Line 2");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
    }
}
