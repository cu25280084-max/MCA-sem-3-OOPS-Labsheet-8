public class CarBeanDemo {
    public static void main(String[] args) {
        CarBean car = new CarBean();

        car.setMake("Tata");
        car.setModel("Nexon");
        car.setYear(2025);

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}
