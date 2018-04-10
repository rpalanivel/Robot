package com;

import service.RobotService;
import service.RobotServiceImpl;

/**
 * Main application to run robot functionalities
 * 		walking
 * 		carrying
 * 		walkingandcarrying 
 * 		barcodeprice
 * 
 * @author palanivel
 *
 */
public class RobotApp {

	public static void main(String[] args) {
		
		RobotService robotService = new RobotServiceImpl();
		
		/* Input for robot walking case */
		// Positive case
		robotService.walking(4);
		// Negative case
		robotService.walking(6);
		
		/* Input for robot carrying case */
		// Positive case
		robotService.carrying(8.5);
		// Negative case
		robotService.carrying(12);
		
		/* Input for robot walking and carrying case */
		// Positive case
		robotService.walkingAndCarrying(2,3);
		// Negative case
		robotService.walkingAndCarrying(6,10.1);
		
		/* Input for barcode scanner 
		 */
		// Positive case
		robotService.barCodePrice(100);
		// Negative case
		robotService.barCodePrice(51);
	}

}
