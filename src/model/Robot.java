package model;

import util.Constants;

/**
 * Bean class for robot attributes
 *
 */
public class Robot {
	/*
	 * Robot battery light signal
	 */
	public enum LightColor{
		GREEN,RED
	}

	private int walkingDistance;
	
	private int carryWeight;
	
	private int charge;
	
	private LightColor headLight;
	
	/**
	 * 
	 * @return
	 */
	public int getWalkingDistance() {
		return walkingDistance;
	}

	/**
	 * 
	 * @param walkingDistance
	 */
	public void setWalkingDistance(int walkingDistance) {
		this.walkingDistance = walkingDistance;
	}

	/**
	 * 
	 * @return
	 */
	public int getCarryWeight() {
		return carryWeight;
	}

	/**
	 * 
	 * @param carryWeight
	 */
	public void setCarryWeight(int carryWeight) {
		this.carryWeight = carryWeight;
	}

	/**
	 * 
	 */
	public Robot(){
		this.charge = 100;
		this.walkingDistance = Constants.MAX_WALK_DISTANCE;
		this.carryWeight = Constants.MAX_CARRY_WEIGHT;
		this.headLight = LightColor.GREEN;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getCharge() {
		return charge;
	}

	/**
	 * 
	 * @param maxCharge
	 */
	public void setCharge(int charge) {
		this.charge = charge;
	}

	/**
	 * 
	 * @return
	 */
	public LightColor getHeadLight() {
		return headLight;
	}

	/**
	 * 
	 * @param headLight
	 */
	public void setHeadLight(LightColor headLight) {
		this.headLight = headLight;
	}

}
