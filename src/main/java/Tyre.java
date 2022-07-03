import java.util.Random;

public class Tyre {

    int pressure;
    boolean flatTire = false;

    public void checkTyre() {
        if (pressure <= 1000) {
            flatTire = true;
        }
    }

    public Tyre(int pressure, boolean flatTire) {
        this.pressure = pressure;
        this.flatTire = flatTire;
    }



    @Override
    public String toString() {
        return "Tyre{" +
                "pressure=" + pressure +
                ", flatTire=" + flatTire +
                '}';
    }
}
