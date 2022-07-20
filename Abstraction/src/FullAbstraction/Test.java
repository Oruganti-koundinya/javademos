package FullAbstraction;

public class Test {
	public static void main(String[] args) {
		
		Car car = new RollsRoyce();
		car.go();
		car.stop();
		
		Car CAR = new Ferrari();
		CAR.go();
		CAR.stop();
	}

}
