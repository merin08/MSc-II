/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics;
import ch.aplu.robotsim.*;

/**
 *
 * @author admin
 */
public class MoveWithGearRect {
    public MoveWithGearRect(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        g.right(550);
        g.forward(2500);
        g.left(550);
        g.forward(1000);
        g.left(550);
        g.forward(2500);
        g.left(550);
        g.forward(1000);
        robot.exit(); 
    }
public static void main (String [] args){
    new MoveWithGearRect();
    
}

}
