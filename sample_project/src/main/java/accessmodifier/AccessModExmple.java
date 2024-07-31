package accessmodifier;

public class AccessModExmple {

	public static void main(String[] args) {
		
		AccessModExmple obj = new AccessModExmple();
		obj.hello();
		obj.number();
		obj.name();
		obj.display();

	}
	public void hello()
	{
		System.out.println("This is public");
	}
	
	private void number ()
{
		System.out.println("This is private");
}
	protected void name()
	{
		System.out.println("This is protected");
	}
	void display()
	{
		System.out.println("This is Default");
		
	}


}
