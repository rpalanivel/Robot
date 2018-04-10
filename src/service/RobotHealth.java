package service;

import model.Robot.LightColor;
import util.Constants;

/**
 * 
 * Implementation for the common validations of basichealth
 *
 */
public class RobotHealth extends BasicHealth {
	
	/**
	 * Validation to check max carrying weight
	 */
	@Override
	public boolean validCarry(double weight){
		if(weight > 10){
			System.out.println("Robot overweighted - ( Max 10 kg allowed ) \n");
			return false;
		}
		return true;
	}
	
	/**
	 * Validation for max walking distance
	 */
	@Override
	public boolean validWalk(double distance){
		if(distance > 5 ){
			System.out.println("Robot cannot walk more than 5 km \n");
			return false;
		}
		return true;
	}
	
	/**
	 * Validation for max carrying weight and walking distance
	 */
	@Override
	public void checkCharge(int currentCharge, int consumedCharging){
		if(currentCharge < consumedCharging){
			System.out.println("Robot has in-sufficient charge for task \n");
		}else{
			if(consumedCharging >= 15)
				System.out.println(Constants.BATTERY_LIGHT_SIGNAL+" -> "+LightColor.GREEN +"\n");
			else
				System.out.println(Constants.BATTERY_LIGHT_SIGNAL+" -> "+LightColor.RED +"\n");
		}
	}

}
