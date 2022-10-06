/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics;
import ch.aplu.robotsim.*;
import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Merin
 */
public class ultrasonic {
    ultrasonic(){
        LegoRobot robot = new LegoRobot();
        Gear gear = new Gear();
        robot.addPart(gear);
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        robot.addPart(us);
        us.setBeamAreaColor(Color.green);
        us.setProximityCircleColor(Color.lightGray);

        double arc = 0.5;
        gear.setSpeed(50);
        gear.rightArc(arc);
        boolean isRightArc = true;

        int oldDistance = 0;
        while (true)
        {
          Tools.delay(100);
          int distance = us.getDistance();
          if (distance == -1)
            continue;
          if (distance < oldDistance)
          {
            if (isRightArc)
            {
              gear.leftArc(arc);
              isRightArc = false;
            }
            else
            {
              gear.rightArc(arc);
              isRightArc = true;
            }
          }
          oldDistance = distance;
        }
      }

      static{
        Point[] mesh_bar =
        {
          new Point(10, 200), new Point(-10, 200),
          new Point(-10, -200), new Point(10, -200)
        };
        RobotContext.useTarget("sprites/bar1.gif", mesh_bar, 200, 250);
        RobotContext.useTarget("sprites/bar1.gif", mesh_bar, 300, 250);

        RobotContext.setStartPosition(250, 460);
      }

    public static void main(String[] args) {
        new ultrasonic();
    }
}

