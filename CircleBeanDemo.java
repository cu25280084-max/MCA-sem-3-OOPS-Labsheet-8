public class CircleBeanDemo {
    public static void main(String[] args) {
        CircleBean circle = new CircleBean();
        circle.setRadius(5);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}
