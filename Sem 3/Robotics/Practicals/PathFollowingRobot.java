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
public class PathFollowingRobot {
    static
    {
        NxtContext.setStartPosition(269,232);
        NxtContext.setStartDirection(-90);
        NxtContext.useBackground("sprites/path.gif");
    }
    PathFollowingRobot(){
        NxtRobot r = new NxtRobot();
        Gear g = new Gear();
        LightSensor ls1 = new LightSensor(SensorPort.S1);
        LightSensor ls2 = new LightSensor(SensorPort.S2);
        r.addPart(g);
        r.addPart(ls1);
        r.addPart(ls2);
        g.forward();
        g.setSpeed(100);
   
        while(true)
        {
            int rightValue=ls1.getValue();
            int leftValue=ls2.getValue();
            
            System.out.println(leftValue);
            
            if(leftValue < 10)
                g.rightArc(0.05);
            if(rightValue < 10)
                g.leftArc(0.05);
            if(leftValue > 10 && rightValue > 10)
                g.forward();
        }
    }
    public static void main(String args[])
    {
        new PathFollowingRobot();
    }
}
