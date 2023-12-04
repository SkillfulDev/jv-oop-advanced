package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}
