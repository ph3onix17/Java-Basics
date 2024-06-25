import java.util.Scanner;

public class First{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius of cylinder: ");
		double radius = in.nextDouble();
		System.out.println("Enter length of cylinder: ");
		double length = in.nextDouble();
		
		double area = radius * radius * 3.14159;
		double arear = Math.round(area * 100000.0) / 100000.0;
		double volume = area * length;
		double volumer = Math.round(volume * 100000.0)/ 100000.0;
		System.out.println("Area of Cylinder: " + arear );
		System.out.println("Volume of Cylinder: " + volumer );
	}
}