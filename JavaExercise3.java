
public class JavaExercise3 {

	public static void main(String[] args) {
		int A = 1;
		int B = 0;
		int C = -4;
		int Qd=(B*B)-(4*A*C);
		
		if(Qd<0);
			System.out.println("There is no solution");
		else if (Qd==0)
			{
					System.out.println("There is one solution");
					double x3=(-1*B+Math.sqrt(Qd))/(2*A);
					System.out.println("The only solution is: "+x3);
			}
		else
		{
			System.out.println("There is 2 solutions");
			double x1=(-1*B+Math.sqrt(Qd))/(2*A);
			double x2=(-1*B+Math.sqrt(Qd))/(2*A);		
			System.out.println("The first solution is: "+x1);
			System.out.println("The second solution is: "+x2);

		
		}


	}

}
