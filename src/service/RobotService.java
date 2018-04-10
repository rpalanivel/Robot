package service;

/**
 * RobotService interface to expose required functions
 * 
 */
public interface RobotService {
	void walking(double distance);
	void carrying(double weight);
	void walkingAndCarrying(double distance, double weight);
	void barCodePrice(int barCode);
}
