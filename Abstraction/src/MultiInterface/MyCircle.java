package MultiInterface;

public class MyCircle implements CircleOne, CircleTwo{

	public static void main(String[] args) {
		

	}

	@Override
	public void calculateArea(int radius) {
		System.out.println(CircleOne.pi);
	}

	@Override
	public void calculateArea() {
		System.out.println(CircleTwo.pi);
		
	}

}
