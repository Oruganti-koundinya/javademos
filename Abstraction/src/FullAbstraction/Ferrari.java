package FullAbstraction;

public class Ferrari implements Car{

	@Override
	public void go() {
		System.out.println("(Inside) Ferrari Go");
		
	}

	@Override
	public void stop() {
		System.out.println("(Inside) Ferrari Stop");
		
	}
	

}
