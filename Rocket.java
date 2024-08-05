class Rocket
{
	String country;//ref
	double speed;//method
	int fuelCapacity=500;//literal
	int noOfThrusters;//constructor
	public void display()
	{
		System.out.println("Country:"+this.country);
		System.out.println("Speed:"+this.speed);
		System.out.println("Fuel Capacity:"+this.fuelCapacity);
		System.out.println("Number of Thrusters:"+this.noOfThrusters);
	}
	public Rocket(double speed)
	{
		this.speed=speed;
	}
	public void setNoOfThrusters(int noOfThrusters)
	{
		this.noOfThrusters=noOfThrusters;
	}
}