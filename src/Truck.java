public class Truck implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Truck speed");
    }

    @Override
    public void Start() {
        System.out.println("Truck start");
    }

    @Override
    public void mileage() {
        System.out.println("Truck mileage");
    }

    @Override
    public void stop() {
        System.out.println("Truck stop");
    }

    @Override
    public void details() {
        System.out.println("details of truck");
    }
}
