package OOP;

public class Polymorphism {
    public static void main(String[] args) {
        Polymorphism p=new Polymorphism(4);
        Round r= new Round(4);
        Square s=new Square(4);
        p.area(4);
        r.area(4);
        s.area(4);

    }
        int size;
        Polymorphism(int size){
            this.size=size;
        }
        void area(int size){
            System.out.println(size+2);

        }
    }
    class Round extends Polymorphism{
        Round(int size){
            super(size);

        }
        void area(int size){
            System.out.println(size+20);
        }

    }
    class Square{
    int size;
    Square(int size){
        this.size=size;
    }
        void area(int size){
            System.out.println(size-20);
        }
        void area(double size){
            System.out.println(size-20);
        }

    }

