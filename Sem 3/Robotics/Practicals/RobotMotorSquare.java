/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotics;
import ch.aplu.robotsim.*;
import java.util.*;

/**
 *
 * @author Merin
 */
public class RobotMotorSquare {
    NxtRobot nxtRobot;
    Motor motorLeft, motorRight;
	
    public RobotMotorSquare() {
	nxtRobot = new NxtRobot();
	motorLeft = new Motor(MotorPort.A);
	motorRight = new Motor(MotorPort.B);
		
	nxtRobot.addPart(motorLeft);
	nxtRobot.addPart(motorRight);
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter left for left and right for right:");
	String direction = scanner.nextLine();
		
	switch(direction){
            case "left":
                moveRobot("left");
		break;
			
            case "right":
		moveRobot("right");
		break;
            
            default:
		System.out.println("Please specify the correct direction");
		System.exit(1);
		break;
        }
    }
    public void moveRobot(String direction) {
        for(int i = 0; i < 4; i++) {
            if(direction == "left") {
                motorLeft.forward();
		Tools.delay(1090);
		motorRight.forward();
            }
            else {
		motorRight.forward();
		Tools.delay(1090);
		motorLeft.forward();
            }
            Tools.delay(1090);
            motorLeft.stop();
            motorRight.stop();
        }
    }
    public static void main(String[] args) {
	new RobotMotorSquare();
    }
}
