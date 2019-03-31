package dd;

import lejos.robotics.RegulatedMotor;
import lejos.hardware.motor.Motor;

public class aaa {
	public static void main(String[] args){
		RegulatedMotor leftMotor = Motor.A;
		RegulatedMotor rightMotor = Motor.D;
		leftMotor.setSpeed(200);
		rightMotor.setSpeed(200);
		// leftMotor.setAcceleration(800);
		// rightMotor.setAcceleration(800);
		leftMotor.forward();
		rightMotor.backward();
		
		try{
			Thread.sleep(1050);
		}catch(InterruptedException e){}
		
		leftMotor.stop();
		rightMotor.stop();
		
//		leftMotor.rotate(300);
//		rightMotor.rotate(300);
		
		leftMotor.setSpeed(200);
		rightMotor.setSpeed(200);
		leftMotor.forward();
		rightMotor.forward();
		
		try{
			Thread.sleep(4000);
		}catch(InterruptedException e){}

		
	}
	
}
