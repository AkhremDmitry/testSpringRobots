package config;

import interfaces.Head;
import interfaces.Leg;
import objects.RedHead;
import objects.RedLeg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import start.RobotNew;


@Configuration
public class AppConfiguration {

    @Bean
    public RobotNew robotNew(){
        return new RobotNew(redHead(),redLeg());
    }

    @Bean
    public Head redHead(){
        return new RedHead();
    }

    @Bean
    public Leg redLeg(){
        return new RedLeg();
    }

}
