public class CarFactory {
    public Car createCar(String whatCar) {
        if (whatCar.equals("electric")) {
            return ElectricCar.createCar;
        } else if (whatCar.equals("petrol")) {
            return new PetrolCar();

        }
        else{
            System.out.println("no such car can be made in the factory");
        }
        return null;

    }
}
