public class Main {

	public static void main(String[] args) {
		Student obj1= new Student();
		
		obj1.Set_Id(123);
		obj1.Set_name("Chris");
		obj1.Set_Major("LS");
		
		
		System.out.println(obj1.getId());
		System.out.println(obj1.getMajor());
		System.out.println(obj1.getname());
		
		Student obj2=new Student();
		obj2.Set_Id(123);
		obj2.Set_name("Chris");
		obj2.Set_Major("LS");
		
		System.out.println(obj2.getId());
		System.out.println(obj2.getMajor());
		System.out.println(obj2.getname());
		
		Rectangle RecObj1=new Rectangle ();
		RecObj1.set_L(5);
		RecObj1.set_W(2);
		System.out.println(RecObj1.get_L());
		System.out.println(RecObj1.get_W());
		
	
	
	
	
	}
	}
	