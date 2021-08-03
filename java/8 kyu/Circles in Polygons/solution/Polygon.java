public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
        return sideLength / (Math.tan((180D / sides) * Math.PI / 180D));
    }
}