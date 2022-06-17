package week1.day2.classroom.arrays;

public class Car {
	public static void main(String[] args) {
		
		
	Car obj = new Car();
	 obj.applyBreak();
	 System.out.println("applyBreak:"+obj.applyBreak());
	 
	 obj.applyGear();
	 System.out.println("apply Gear:"+obj.applyGear());
	 
	 obj.switchOnAc();
	 System.out.println("switch on AC:"+ obj.switchOnAc());
	 
	 obj.applyAcclerate();
	 System.out.println("apply Acclerate:"+obj.applyAcclerate());
	 
		
	}

	public String applyBreak()
	{
	String applyBreak="Stop the engine";
	return applyBreak;
	}
	public String applyGear() {
		
		String applyGear="Change the Gear to 3";
		return applyGear;
	}
	public boolean switchOnAc()
	{
		
		return false;
	}
	
	public String applyAcclerate()
	{
		String applyAcclerate="The vechicle moves fast";
		return applyAcclerate;
	}
}