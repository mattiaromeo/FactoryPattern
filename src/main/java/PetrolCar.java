public class PetrolCar implements Car {
    public PetrolCar(){
        createCar();
    }
    @Override
    public void createCar() {
        System.out.println("a new petrol car has been created");

    }
}
