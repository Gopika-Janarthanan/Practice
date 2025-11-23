public class Main{
    public static void main() {
        Vehicle v  = new Truck();// Parent reference
        v.stop(); // Truck's owner
        v=new Bus(); // reassign
        v.details(); // Bus detail
        CarSub subcar = new CarSub(); //subclass of car
        subcar.mileage(); // car property
        subcar.performance(); // sub car performance
        subcar.listdetails();


    }
}
