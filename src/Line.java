public class Line implements Comparable<Line>{
    Point p1;
    Point p2;
    Double length;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        calculateLength();
    }

    public void calculateLength() {
        length = (Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2)));
    }

    public boolean equals(Line other) {
        return this.length.equals(other.length);
    }

    public int compareTo(Line other) {
        return this.length.compareTo(other.length);
    }
}
