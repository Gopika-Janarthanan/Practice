public class Car implements Vehicle {


    @Override
    public void speed() {
        System.out.println("Car speed");
    }

    @Override
    public void Start() {
        System.out.println("car start");
    }

    @Override
    public void mileage() {
        System.out.println(" car mileage");
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }

    @Override
    public void details() {
        System.out.println("details of car");
    }
}
