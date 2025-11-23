import java.util.ArrayList;

public class CarSub extends Car {
    void performance(){
        System.out.println("Performance of sub car");
    }
    public static void main(String[] args) {

        CarSub c = new CarSub();
        c.mileage();
        c.performance();

    }
     void listdetails(){
        ArrayList<String> cardetails=new ArrayList<>();
        cardetails.add("BMW");
        cardetails.add("200KM");
        cardetails.add("Black colour");
        cardetails.add("Petrol");
        for(String i : cardetails){
            System.out.print(i+ "->");
        }
    }
}
