public class ElectricCar implements Car {

    protected ElectricCar() {
    }

    @Override
    public static createCar() {
        System.out.println("a new electric car has been created");
        return new ElectricCar();


    }
}
