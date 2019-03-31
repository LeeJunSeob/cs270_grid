package test_IR;

import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.sensor.EV3IRSensor;
import lejos.hardware.port.SensorPort;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
import java.lang.String;

public class test_IR {
	private static EV3IRSensor sensor;
	
	public static void main(String[] args){
		EV3 ev3= (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();
		
		sensor = new EV3IRSensor(SensorPort.S1);
		
		SampleProvider distanceMode = sensor.getDistanceMode();
		float value[] = new float[distanceMode.sampleSize()];
		
		do {
			distanceMode.fetchSample(value, 0);
			float centimeter = value[0];
			
			lcd.clear();
			lcd.drawString("Distance : "+ centimeter, 1, 4);
			
			Delay.msDelay(100);
			
		} while(keys.getButtons()!=keys.ID_ESCAPE);
	}

}
