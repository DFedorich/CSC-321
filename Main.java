public class Main {

	public static void main(String[] args) {
		Student obj= new Student();
		obj.Set(123, "Chris", "LS");
		
		System.out.println(obj.getId());
		System.out.println(obj.getMajor());
		System.out.println(obj.getname());
		
		Student obj2=new Student();
		obj2.Set(124,  "Ben",  "CS");
		
		System.out.println(obj.getId());
		System.out.println(obj.getMajor());
		System.out.println(obj.getname());
		

	}

}