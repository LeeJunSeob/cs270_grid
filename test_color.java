package test_color;


import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.port.SensorPort;
import lejos.robotics.Color;

import java.lang.String;

public class test_color {
	private static EV3ColorSensor color_sensor;

	public static void main(String[] args) {
		EV3 ev3 = (EV3) BrickFinder.getLocal();
		TextLCD lcd = ev3.getTextLCD();
		Keys keys = ev3.getKeys();

		color_sensor = new EV3ColorSensor(SensorPort.S2);

		do {
			String str = "";

			int color_id = color_sensor.getColorID();

			switch(color_id)
				{
				case Color.BLACK:
					str = "Color.BLACK = "+String.valueOf(color_id);
					break;
				case Color.BLUE:
					str = "Color.BLUE = "+String.valueOf(color_id);
					break;
				case Color.BROWN:
					str = "Color.BROWN = "+String.valueOf(color_id);
					break;
				case Color.CYAN:
					str = "Color.CYAN = "+String.valueOf(color_id);
					break;
				case Color.DARK_GRAY:
					str = "Color.DARK_GRAY = "+String.valueOf(color_id);
					break;
				case Color.GRAY:
					str = "Color.GRAY = "+String.valueOf(color_id);
					break;
				case Color.GREEN:
					str = "Color.GREEN = "+String.valueOf(color_id);
					break;
				case Color.LIGHT_GRAY:
					str = "Color.LIGHT_GRAY = "+String.valueOf(color_id);
					break;
				case Color.MAGENTA:
					str = "Color.MAGENTA = "+String.valueOf(color_id);
					break;
				case Color.NONE:
					str = "Color.NONE = "+String.valueOf(color_id);
					break;
				case Color.ORANGE:
					str = "Color.ORANGE = "+String.valueOf(color_id);
					break;
				case Color.PINK:
					str = "Color.PINK = "+String.valueOf(color_id);
					break;
				case Color.RED:
					str = "Color.RED = "+String.valueOf(color_id);
					break;
				case Color.WHITE:
					str = "Color.WHITE = "+String.valueOf(color_id);
					break;
				case Color.YELLOW:
					str = "Color.YELLOW = "+String.valueOf(color_id);
					break;
				default:
					str = "???";
					break;
			}

			lcd.drawString(str, 1, 4);
			keys.waitForAnyPress();
			lcd.clear();
		} while(keys.getButtons() != Keys.ID_ESCAPE);
	}
}