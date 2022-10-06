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
public class RobotMotorCircle {
    RobotMotorCircle(){
        NxtRobot r = new NxtRobot();
        Motor A = new Motor(MotorPort.A);
        Motor B = new Motor(MotorPort.B);
        r.addPart(B);
        r.addPart(A);
        A.setSpeed(100);
        B.setSpeed(100);
        A.forward();
        B.forward();
        while (true){
            Tools.delay(200);
            A.stop();
            Tools.delay(200);
            A.forward();
        }
    }

    public static void main(String arg[]) {
        new RobotMotorCircle();
    }
}
