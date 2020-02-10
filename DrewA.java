package asas;

public class DrewA {

	public static void main(String[] args) {
	System.out.println("Welcome to class A");
	B obj=new B();
	obj.z=5;
	System.out.println(obj.z);
	obj.y=7;
	System.out.println(obj.y);
	obj.set_x(8);
	System.out.println(obj.get_x());
	C obj1=new C();
	obj1.C=10;
	System.out.println(obj1.C);
	
	ClassD obj2=new ClassD();
	System.out.println(obj2.V1);
	System.out.println(obj2.V2);
	
	
	}

}
