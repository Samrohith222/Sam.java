import java.util.Scanner;
class circle{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the radius of the circle :");
		double r = input.nextInt();
		double area = 3.14 * r * r ;
		System.out.println("Area of the circle is ="+area);
		input.close();
}
}