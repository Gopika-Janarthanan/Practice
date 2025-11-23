public class Bus implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Bus speed");
    }

    @Override
    public void Start() {
        System.out.println("Bus start");
    }

    @Override
    public void mileage() {
        System.out.println("Bus mileage");
    }

    @Override
    public void stop() {
        System.out.println("Bus stop");
    }

    @Override
    public void details() {
        System.out.println("Details of Bus");
    }
}
