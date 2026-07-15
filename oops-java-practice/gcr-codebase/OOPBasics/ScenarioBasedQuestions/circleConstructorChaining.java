class ChainedCircle {
    private double radius;

    public ChainedCircle() {
        this(1.0);
    }

    public ChainedCircle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }
}

public class circleConstructorChaining {
    public static void main(String[] args) {
        ChainedCircle defaultCircle = new ChainedCircle();
        ChainedCircle customCircle = new ChainedCircle(5.5);

        defaultCircle.display();
        customCircle.display();
    }
}
