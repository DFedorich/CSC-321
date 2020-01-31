import java.util.Scanner;

public class JavaExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Input the first number: 5");
System.out.println("Input the second number: 10");
System.out.println("Input the third number: 15");
System.out.println("the result is: true");

int x = 5;
int y = 20;
int p = 3;
System.out.println(result(x,y,p));
	}
public static int result(int x, int y, int p) {	
if (x%p == 0)
	return( y/p - x/p + 1);
return(y/p - x/p);



    Scanner in = new Scanner(System.in);
    System.out.print("Input the first number : ");
    int a = in.nextInt();  
	System.out.print("Input the second number: ");
	int b = in.nextInt(); 
	System.out.println("Result: "+result(a, b));

public static int result(int x, int y);
   if(x == y)
	return 0;
    if(x % 6 == y % 6)
	    return (x < y) ? x : y;
    return (x > y) ? x : y;
 




}

}