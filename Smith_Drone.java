//Author Name: Ian Smith
//Date: 8/24/2019
//Program Name: Smith_Drone
//Purpose: Simulation using button, drone movement in x, y, z location


public class Smith_Drone {
	//main method to test and run class methods
	public static void main(String args[]) {
			//instantiating drone and setting a location
			Smith_Drone drone1 = new Smith_Drone(25,37,2000);
			
			//obtaining drones current position
			drone1.getCurrentPosition();
			
			//using each method to change each coordinate value to move the drone
			drone1.changeHeight(3);
			drone1.changeLatitude(90);
			drone1.changeLongitude(56);
			
			//obtaining new location of drone
			drone1.getCurrentPosition();
	}
		
		
	//private variables for x,y,z locations declared 
	private double xLongitude;
	private double yLatitude;
	private double zHeight;
	
	//overloaded constructor used to set specific initial location
	public Smith_Drone(double longitude, double latitude, double height ) {
		this.xLongitude = longitude;
		this.yLatitude = latitude;
		this.zHeight = height;
	}
	
	
	public Smith_Drone() {
		// TODO Auto-generated constructor stub
	}


	//sets drones longitude (x value)
	public void setLongitude(double longitude) {
		xLongitude = longitude;
	}
	
	//sets drones latitude (y value)
	public void setLatitude(double latitude) {
		yLatitude = latitude;
	}

	//sets drones height (z value)
	public void setHeight(double height) {
		zHeight = height;
	}
	
	
	//returns drones current longitude (x value)
	public double getLongitude() {
		return xLongitude;
	}
	
	//returns drones current latitude (y value)
	public double getLatitude() {
		return yLatitude;
	}
	
	//returns drones current height (z value)
	public double getHeight() {
		return zHeight;
	}
	
	//uses getter methods to obtain current x, y, z location values and prints current location
	public void getCurrentPosition() {
		double x = getLongitude();
		double y = getLatitude();
		double z = getHeight();
		System.out.println("Current position is X: " + x + " Y: " + y + " Z: " + z);
		
	}
	
	//accepts a new longitude as parameter and changes the drones x value
	public void changeLongitude(double newLongitude) {
		xLongitude = newLongitude;
	}
	
	//accepts a new latitude as parameter and changes the drones y value
	public void changeLatitude(double newLatitude) {
		yLatitude = newLatitude;
	}

	//accepts a new height as parameter and changes the drones z value
	public void changeHeight(double newHeight) {
		setHeight(newHeight);
	}
	
	
}
