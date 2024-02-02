public class Wheel {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Wheel(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                '}';
    }
}
