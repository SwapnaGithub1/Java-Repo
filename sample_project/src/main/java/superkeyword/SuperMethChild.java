package superkeyword;

public class SuperMethChild extends SuperMethParent {

	public static void main(String[] args) {
		SuperMethChild obj = new SuperMethChild();
		obj.display1();

	}
	public void display1()
	{
		System.out.println("This is Child class method");
		super.display();
	}

}
