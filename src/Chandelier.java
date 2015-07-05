/**
 * Class Chandelier has:
 * -volt
 * -mounting on the wall
 * -from the power outlet
 */

public class Chandelier extends LightDevice {

    int volt220 = 220;
    String mount = "Mounting on the wall";
    String power = "From the power outlet";

    @Override
    public String toString() {
        return "Chandelier{" +
                "volt220=" + volt220 +
                ", mount='" + mount + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}

