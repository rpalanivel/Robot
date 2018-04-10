package service;

import model.Robot;

/**
 * 
 * BasicHealth abstract class for common validations
 *
 */
public abstract class BasicHealth {
	
	abstract boolean validCarry(double weight);
	abstract boolean validWalk(double distance);
	abstract void checkCharge(int currentCharging, int consumedCharging);

}
