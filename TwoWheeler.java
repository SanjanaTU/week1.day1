package week1.day2.assignment;

public class TwoWheeler {
	private static double runningKm;
	private static String bikeName;

	public static void main(String[] args) 
	{
	
    TwoWheeler obj = new TwoWheeler();
    int noOfWheels = obj.noOfWheels();
    System.out.println("noOfWheels"+":"+obj.noOfWheels());
    
    short noOfMirrors = obj.noOfMirrors();
    System.out.println("noOfMirror"+":"+obj.noOfMirrors());
    
    long chassisNumber = obj.chassisNumber();
    System.out.println("chassisNumber"+":"+ obj.chassisNumber());
    
    boolean punctured = obj.isPunctured();
    System.out.println("isPunctured"+":"+ obj.isPunctured());
    
    setBikeName(obj.bikeName());
    System.out.println("bikeName"+":"+obj.bikeName());
    
    runningKm = obj.runningKm();
    System.out.println("runningKm"+":"+obj.runningKm());
      }

 public int noOfWheels()
{
	int noOfWheels=2;
	return noOfWheels;
}

 public short noOfMirrors()
 	{
	short noOfMirrors=2;
	return noOfMirrors;
	}
 public long chassisNumber()
 {
	 long chassisNumber=788915557;
	 return chassisNumber;
 }

 boolean isPunctured()
  	{
			return false;
  	}
  
  public String bikeName()
  	{
	  String bikeName="Scooty";
	  return bikeName;
  	}
  
  public double runningKm()
  	{
	  double runningKm=7891.456598;
	  return runningKm;
  	}

public static String getBikeName() {
	return bikeName;
}

public static void setBikeName(String bikeName) {
	TwoWheeler.bikeName = bikeName;
}
  
}