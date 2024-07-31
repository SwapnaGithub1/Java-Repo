package aggregation;

public class AggSecondClass {
	String place;
	AggFirstClass b;

	public static void main(String[] args) {
		AggFirstClass obj1 = new AggFirstClass(27,"Swapna");
		AggSecondClass obj2 = new AggSecondClass("Trivandrum",obj1);
		obj2.display();

	}
	public AggSecondClass(String place, AggFirstClass b)
	{
		this.place=place;
		this.b=b;
		
	}
	public void display()
	{
		System.out.println("Name: "+b.name+" Age: "+b.age);
		System.out.println("Place: "+place);
	}

}
