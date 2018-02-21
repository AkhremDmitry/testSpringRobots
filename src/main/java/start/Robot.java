package start;

import interfaces.BlueLg;
import interfaces.Head;
import interfaces.Leg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Robot{
    @Autowired
    @Qualifier("blueHead")
    private Head head;
    @Autowired
    @BlueLg
    private Leg leg;

    public Robot (){

    }

    public Robot(Head head, Leg leg) {
        this.head = head;
        this.leg = leg;
    }

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
}
