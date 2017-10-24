public class PetrolCar implements Car {
    protected PetrolCar() {
        createCar();
    }

    @Override
    public Car createCar() {

        System.out.println("a new petrol car has been created");
        return new PetrolCar();

    }
}
