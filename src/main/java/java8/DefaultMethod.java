package java8;

public class DefaultMethod {
    public static void main(String[] args) {
        TwoWheeler tw = new Car();
        tw.print();

    }

    public interface Vehicle {
        default void print() {
            System.out.println("Its a Vehicle");
        }

        static void horn() {
            System.out.println("blowhorn");
        }
    }

    public interface TwoWheeler {
        default void print() {
            System.out.println("Its Two wheeler");
        }
    }

    public static class Car implements Vehicle, TwoWheeler {
        public void print() {
            Vehicle.super.print();
            Vehicle.horn();
            TwoWheeler.super.print();
        }

    }

}
