package polymorphism;

public class PolymorChildclass extends PolymorParentClass {

	public static void main(String[] args) {
		PolymorChildclass obj1 = new PolymorChildclass();
		obj1.mul(8.5f, 2.5f);
		

	}
	public void mul(float a, float b)
	{
		super.mul(5, 20);
		System.out.println("Prouduct of two Floting No.s: "+a*b);
	}

}
