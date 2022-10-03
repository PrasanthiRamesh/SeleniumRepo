package Assignments;

public class TwoWheeler {
	
	public int noOfWheels() {
		int noOfWheels =2;
		return noOfWheels;
	}
	public short noOfMirror(){
		short noOfMirror =2;
     	return noOfMirror;
	}
	public long chassisNumber() {
		long chassisNumber =9266;
		return chassisNumber;
	}
	public boolean isPuntchure() {
		boolean puncture= false;
		return puncture;
	}
	public String bikeName() {
		String bikeName= "Royal Enfield";
		return bikeName;
			}
	public double runningKM() {
		double runningKM= 500;
		return runningKM;
			}
	
	public static void main(String[] args) {
		
		TwoWheeler TW= new TwoWheeler();
		
		String bikeName = TW.bikeName();
		System.out.println("Name of the bike is -" + bikeName );
		
		int noOfWheels = TW.noOfWheels();
		System.out.println("The No Of wheels is -" + noOfWheels);
		
		short noOfMirror = TW.noOfMirror();
		System.out.println("The No Of Mirror is -" + noOfMirror);
		
		long chassisNumber = TW.chassisNumber();
		System.out.println("The Chassis Numeber is -" + chassisNumber);
	
		boolean puntchure = TW.isPuntchure();
		System.out.println("Is the Bike  Puntchure -" + puntchure);
		
		double runningKM = TW.runningKM();
		System.out.println("Running KM is -" + runningKM);
		
	}

}
