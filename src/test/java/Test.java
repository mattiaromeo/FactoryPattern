
import org.assertj.core.api.Assertions;


public class Test {
    CarFactory volvoGent = new CarFactory();


    @org.junit.Test
    public void createPetrolCarReturnsPetrolCar() throws Exception {

        String expected = "a new petrol car has been created";
        Assertions.assertThat(volvoGent.createCar("petrol")).isInstanceOf(PetrolCar.class);
    }

    @org.junit.Test
    public void createElectricCarReturnsElectricCar() throws Exception {
        String expected = "a new electric car has been created";
        Assertions.assertThat(volvoGent.createCar("electric")).isInstanceOf(ElectricCar.class);
    }
}
