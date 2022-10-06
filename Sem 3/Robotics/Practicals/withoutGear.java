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
public class withoutGear {
    withoutGear(){
        TurtleRobot t = new TurtleRobot();
        t.forward(100);
        t.left(90);
        t.forward(100);
        t.right(90);
        t.forward(100);
    }
public static void main(String[] args){
    new withoutGear();
}
}
