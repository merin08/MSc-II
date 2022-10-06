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
public class MoveWithMotors {
     MoveWithMotors(){
      NxtRobot r=new NxtRobot();
      Motor m1=new Motor(MotorPort.A);
      Motor m2=new Motor(MotorPort.B);
      r.addPart(m1);
      r.addPart(m2);
      m1.forward();
      Tools.delay(1000);
      m2.forward();
      m1.stop();
      Tools.delay(200);
      m1.forward();
      
    }
public static void main(String[] args){
    new MoveWithMotors();
}
}
