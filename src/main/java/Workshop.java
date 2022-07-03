import java.util.Arrays;

public class Workshop {
    Car car;
    Tyre tyre;

    public Workshop(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Workshop{" +
                "car=" + car +
                '}';
    }

    public Workshop(Car car) {
        this.car = car;
    }

    public int countOfRepear(Tyre[] tyre) {
        int counterOfRepear = 0;
        for (int i = 0; i < tyre.length; i++) {
            if (tyre[i].pressure < 2000) {
                counterOfRepear += 1;
                int pressureToRefill = 2500 - tyre[i].pressure;
                tyre[i].pressure = tyre[i].pressure + pressureToRefill;
                tyre[i].flatTire = false;
                return counterOfRepear;
            }
        }
        return 0;
    }

    public static String createBill(int counter) {
        int toPay = counter * 60;
        String bill = "Ilosc naprawionych kol: " + counter + " . Do zaplaty: " + toPay;
        return bill;
    }

 /*  public void repearTyre(Tyre[] tyre) {

        for (int i = 0; i < tyre.length; i++) {
            if (tyre[i].pressure < 2000) {
                int pressureToRefill = 2500 - tyre[i].pressure;
                tyre[i].pressure = tyre[i].pressure + pressureToRefill;
                tyre[i].flatTire = false;
            }
        }
    } */
}