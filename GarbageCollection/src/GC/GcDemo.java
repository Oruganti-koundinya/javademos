package GC;

public class GcDemo {
	public static void main(String[] args) {
		
		Object obj1 = new GcDemo();
		Object obj2 = new GcDemo();
		
		obj1 = null;
		obj2 = null;
		
	}
	GcDemo() {
		System.out.println(this + " created...");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " finalized...");
	}

}
