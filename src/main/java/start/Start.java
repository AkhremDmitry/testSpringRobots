package start;

import config.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Robot redRobot = (Robot)context.getBean("redRobot");
        redRobot.getHead().say();
        redRobot.getLeg().go();

        Robot blueRobot = (Robot) context.getBean("blueRobot");
        blueRobot.getLeg().go();
        blueRobot.getHead().say();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
        RobotNew robotNew = (RobotNew)ctx.getBean(RobotNew.class);
        robotNew.getHead().say();
        robotNew.getLeg().go();
        robotNew.test();


    }
}
