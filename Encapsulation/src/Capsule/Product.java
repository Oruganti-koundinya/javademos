package Capsule;

public class Product {
	
	private int id;
	private String Name;
	private double Cost;
	
	Product(int id, String name, double cost) {
		this.id = id;
		this.Name = name;
		this.Cost = cost;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public double getCost() {
		return this.Cost;
	}
	void DisplayDetais()
	{
		System.out.println("\nProduct_id :" + id + "\nProduct_Name :" + Name + "\nProduct_Cost :" + Cost);
		System.out.println(" ");
	}
}
