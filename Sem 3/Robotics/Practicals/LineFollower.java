/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics;
import ch.aplu.robotsim.*;

/**
 *
 * @author Merin
 */
public class LineFollower {
    LineFollower(){
        LegoRobot r =new LegoRobot();
        Gear g = new Gear();
        LightSensor ls = new LightSensor(SensorPort.S3);
        r.addPart(g);
        r.addPart(ls);
        g.forward();
        g.setSpeed(90);
        while(true){
            int v = ls.getValue();
            System.out.println(v);
            
            if(v < 100){
                g.forward();
            }
            if(v>300 && v<750){
                g.leftArc(0.05);
            }
            if(v>800){
                g.rightArc(0.05);
            }
         }
    }
     static{
        RobotContext.setStartPosition(50,470);
        RobotContext.useBackground("sprites/road.gif");
    }
     
     public static void main(String[] args) {
        new LineFollower();
    }
}
