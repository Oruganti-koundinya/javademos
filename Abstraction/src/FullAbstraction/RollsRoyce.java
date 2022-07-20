package FullAbstraction;

public class RollsRoyce implements Car{
	
	final int numwheels = 4;

	@Override
	public void go() {
		System.out.println("(Inside) Rolls Royce Go");
		
	}

	@Override
	public void stop() {
		System.out.println("(Inside) Rolls Royce Stop");
		
/*	}
	public void modify()
	{
	//	 numwheels = 5;
	}*/
	
}
}
