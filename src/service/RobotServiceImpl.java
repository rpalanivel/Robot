package service;

import model.Robot;

/**
 * 
 * Implementation class for all the robot functions
 *
 */
public class RobotServiceImpl implements RobotService {
	
	private Robot robot;
	private RobotHealth robotHealth;
		
	public RobotServiceImpl() {
		this.robot = new Robot();
		this.robotHealth = new RobotHealth();
	}
	
    /**
     * Robot walking functionality
     */
	@Override
	public void walking(double distance) {
		int maxCharge = 100;
		int consumedCharge = (int) (distance * 20);  
		
		System.out.println("------------------------");
		System.out.println("CASE ::  Robot walking  ");
		System.out.println("------------------------");
		
		if(robotHealth.validWalk(distance)) {
			robot.setCharge(maxCharge-consumedCharge);
			System.out.println("Distance robot walked -> "+ distance +" | Battry Consumed -> "+consumedCharge+" | Remaining Battery -> "+robot.getCharge());			
			robotHealth.checkCharge(maxCharge, consumedCharge);
		} 
	}

	/**
	 * Robot Walking and carrying functionality
	 */
	@Override
	public void walkingAndCarrying(double distance, double weight) {
		int maxCharge = 100;
		int consumedCharge = (int) ((distance * 20) + (weight * 10))/2 ;  
	
		System.out.println("------------------------------------");
		System.out.println("CASE ::  Robot walking and carrying ");
		System.out.println("------------------------------------");
		
		if(robotHealth.validWalk(distance) & robotHealth.validCarry(weight)){
			robot.setCharge(maxCharge-consumedCharge);
			System.out.println("Robot carried -> "+ weight +" kg | Battry Consumed -> "+consumedCharge+" | Remaining Battery -> "+ robot.getCharge());			
			robotHealth.checkCharge(maxCharge, robot.getCharge());
		} 
	}
	
	/**
	 * Robot carrying functionality 
	 */
	@Override
	public void carrying(double weight) {
		
		System.out.println("------------------------");
		System.out.println("CASE ::  Robot carrying ");
		System.out.println("------------------------");
		
		if(robotHealth.validCarry(weight)){
			int maxCharge = 100;
			int consumedCharge = (int) (weight * 10);  
			
			robot.setCharge(maxCharge-consumedCharge);
			System.out.println("Robot carried -> "+ weight +" kg | Battry Consumed -> "+consumedCharge+" | Remaining Battery -> "+ robot.getCharge());			
			robotHealth.checkCharge(maxCharge, robot.getCharge());
		} 
	}
	
	/**
	 * Robot barcode scanner functionality
	 */
	@Override
	public void barCodePrice(int barCode){
		
		System.out.println("------------------------");
		System.out.println("CASE ::  Barcode Pricie ");
		System.out.println("------------------------");
		
		if(barCode % 2 == 0){
			System.out.println("Price is "+ barCode +"\n");
		}else{
			System.out.println("Barcode Scan Failure \n");
		}
	}
}
