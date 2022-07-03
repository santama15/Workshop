import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.random;

public class DemoCar {

    public static void main(String[] args) {

        Tyre[] tyres = new Tyre[4];

        for (int i = 0; i < tyres.length; i++) {
            tyres[i] = new Tyre(2500, false);
        }
        Car car = new Car(tyres);
        System.out.println(car);

        // puncture some tyre

        car.punctureTyre();
        System.out.println("Workshop.Samochod z przebita opona: " + car);

        // workshop get the faulty car
        Workshop workshop = new Workshop(car);

        //before repear
        System.out.println("before repear: " + workshop);

        //after repear
        int countOfRepear = workshop.countOfRepear(car.tyres);
        System.out.println("after repear " + workshop);

        //bill creator
        String bill = workshop.createBill(countOfRepear);

        System.out.println(bill);
    }
}