
public class Main {

	public static void main(String[] args) {
		Student obj= new Student();
		obj.Set("123", "Chris", "LS");
		
		System.out.println(obj.getID());
		System.out.println(obj.getMajor());
		System.out.println(obj.getname());

	}

}
