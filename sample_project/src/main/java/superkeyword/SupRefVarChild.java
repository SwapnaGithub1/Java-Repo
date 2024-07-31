package superkeyword;

public class SupRefVarChild extends SupRefVariable {

	String a="Blue";
	public void display()
	{
		
		System.out.println(super.a);
		System.out.println(a);

	}
	public static void main(String[] args) 
	{
		
		SupRefVarChild obj = new SupRefVarChild();
		obj.display();

	}
	

}
