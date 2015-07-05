/**
 * Class Headlamp has:
 * -volt
 * -mounting on the head
 * -from the power outlet
 */
public class Headlamp extends LightDevice {
    int volt220 = 12;
    String mount = "Mounting on the head";
    String power = "From the power outlet";

    @Override
    public String toString() {
        return "Headlamp{" +
                "volt220=" + volt220 +
                ", mount='" + mount + '\'' +
                ", power='" + power + '\'' +
                '}';
        System.out.println(fggfg);
    }
}
