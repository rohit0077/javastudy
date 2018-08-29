import com.rohith.vehicle.Car;
import com.rohith.vehicle.Vehicle;

public class HelloWorld {

    public static void main(String[] args) {
        Vehicle myVehicle = new Car(4, 5);
        HelloWorld.printDetails(myVehicle);
    }

    public static void printDetails(Vehicle vehicle) {
        vehicle.info();
        vehicle.drive();
    }

}
