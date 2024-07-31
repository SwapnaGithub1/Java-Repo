package superkeyword;

public class SuperConsChild extends SuperConsParent  {

	public static void main(String[] args) {
		SuperConsChild obj = new SuperConsChild();
  
	}
	public SuperConsChild ()
	{
		super("This is parent class constructor");
		System.out.println("This is Child class constructor");
	}

}
