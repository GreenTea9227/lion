import java.util.ArrayList;
import java.util.List;

public class lion2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Car car = new Car();
            car.run();
        }
    }


   static class Car {
        void run() {
            System.out.println("run~~~~!!!!");
        }
   }

}
