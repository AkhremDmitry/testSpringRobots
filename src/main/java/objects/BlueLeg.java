package objects;
import interfaces.BlueLg;
import interfaces.Leg;

@BlueLg
public class BlueLeg implements Leg {
    public void go() {
        System.out.println("Blue robot is dancing");
    }
}
