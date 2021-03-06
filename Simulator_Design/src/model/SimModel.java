package model;

import interpreter.Server;

public interface SimModel {
	// Manual Control Methods
	public void setAileron(double val);
	public void setElevator(double val);
	public void setThrottle(double val);
	public void setRudder(double val);
	
	public double getAileron();
	public double getelevator();
	public double getThrottle();
	public double getRudder();
	
	// General Methods
	public Server getServer(); // includes Server, Client details
	public void connectToServer(String ip, double port); // Connecting to the Simulator as a client
	
	// Run a script Methods
	public void runScript(String text);
}
