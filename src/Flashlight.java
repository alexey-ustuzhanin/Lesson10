/**
 * Class Flashlight has:
 * -volt
 * -keep in hand
 * -power by battery
 */
public class Flashlight extends LightDevice {

    int volt220 = 12;
    String mount = "Keep in hand";
    String power = "Power by battery";

    @Override
    public String toString() {
        return "Flashlight{" +
                "volt220=" + volt220 +
                ", mount='" + mount + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
