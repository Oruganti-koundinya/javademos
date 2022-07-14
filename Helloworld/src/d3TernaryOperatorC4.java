
public class d3TernaryOperatorC4 {

	public static void main(String[] args) {
		int age = 21;
		boolean HasLicense = true;
		
		boolean CanDrive = (age>18) ? (HasLicense ? true : false): false; 
		
		boolean CanRentCar = CanDrive ? (age>18) ? (HasLicense ? true : false): false : false; 
		
		System.out.println("Age = " +age);
		System.out.println("Has License ?" + HasLicense);
		System.out.println("Can Drive ? " + CanDrive);
		System.out.println("Can Rent Car ? " + CanRentCar);
		
		System.out.println("");
		
		String result = CanDrive ? (HasLicense ? "Has License Can Drive" : "No License can't Drive") : "Cannot Drive";
		System.out.println(result);

	}

}
