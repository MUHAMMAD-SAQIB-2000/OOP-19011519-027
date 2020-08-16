
class Car extends Vehicle 
{
	protected String brand = " Ford";
	public void honk()
	{
		System.out.println("tuut,tuut!");
	}
	
}

public class Vehicle 
{
	
	private String modelName = " Mustang ";
	
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public static void main(String[] args) 
	{
		
		Car myFastCar = new Car();
		myFastCar.honk();
		System.out.println( myFastCar.brand + "     " + myFastCar.getModelName());
		

	}

}
