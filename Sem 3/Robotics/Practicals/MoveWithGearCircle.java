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
public class MoveWithGearCircle {
    public MoveWithGearCircle(){
        NxtRobot robot = new NxtRobot();
        Gear g = new Gear();
        robot.addPart(g);
        for(int i =1;i!=0;i++){
            g.forward(200);
            g.right(200);
        }
        
    }
public static void main(String []args){
    new MoveWithGearCircle();
}
    
}
