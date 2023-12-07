package bg.smg;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car c1 = new Car(1997, "make1", "model1");
        Car c2 = new Car(1998, "make2", "model2");
        Car c3 = new Car(1999, "make3", "model3");
        Car c4 = new Car(1999, "make4", "model4");
        Car c5 = new Car(2001, "make5", "model5");

        Collections.sort(cars);
        for(Car c: cars)
        {
            c.print();
        }

    }
}
