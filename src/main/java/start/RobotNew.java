package start;

import interfaces.Head;
import interfaces.Leg;

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
}
