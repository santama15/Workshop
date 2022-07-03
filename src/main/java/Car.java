import java.util.Arrays;
import java.util.Random;

public class Car {

    Tyre[] tyres;

    @Override
    public String toString() {
        return "Car{" + "tyres=" + Arrays.toString(tyres) + '}';
    }

    public Car(Tyre[] tyres) {
        this.tyres = tyres;
    }

    public void punctureTyre() {
        Random random = new Random();
        int randomNumber = random.nextInt(tyres.length);
        for (int i = 0; i < tyres.length; i++) {
            if (randomNumber == i) {
                tyres[i].flatTire = true;
                tyres[i].pressure = 0;
            }
        }
    }
}