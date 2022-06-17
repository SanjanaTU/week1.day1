package week1.day2.assignment;
import week1.day2.classroom.arrays.Car;

public class MyCar {
		public static void main(String[] agrs)
		{
	
  Car obj =new Car();
  obj.applyBreak();
  System.out.println("applyBreak:"+obj.applyBreak());
  obj.applyGear();
  System.out.println("apply Gear:"+obj.applyGear());
  obj.switchOnAc();
  System.out.println("switch on AC:"+ obj.switchOnAc());
  obj.applyAcclerate();
  System.out.println("apply Acclerate:"+obj.applyAcclerate());
	
}
}