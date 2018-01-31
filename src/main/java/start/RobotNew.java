package start;

import config.Description;
import interfaces.Head;
import interfaces.Leg;

import java.lang.reflect.Method;

public class RobotNew {
    private Head head;
    private Leg leg;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public RobotNew(){

    }

    public RobotNew(Head head, Leg leg) {
        this.head = head;
        this.leg = leg;
    }

    @Description(title = "title", version=1, text = "ХЗ зачем все это")
    public void test(){
        System.out.println("test Description");
        try {
            Class<?> c = this.getClass();
            Method m = c.getMethod("test");
            Description des = m.getAnnotation(Description.class);
            System.out.println(des.text()+" "+des.version()+" " +des.title());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
