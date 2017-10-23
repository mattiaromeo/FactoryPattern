public class ElectricCar implements Car {

    public ElectricCar(){
        createCar();
    }
    @Override
    public void createCar() {
        System.out.println("a new electric car has been created");

    }
}
