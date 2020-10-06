import java.util.Scanner;

public class Triangle extends GeometricObject {
	
	public double side1 = 1.0;
	public double side2 = 1.0;
	public double side3 = 1.0;
	
	//Default triangle
	public Triangle() {
		side1 = 0.0;
		side2 = 0.0;
		side3 = 0.0;
	}
	
	//Triangle constructor
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.setColor(color);
		this.setFilled(filled);
	}
	
	//getArea method
	public double getArea() {
		double p = getPerimeter() / 2;
		return Math.sqrt(p * ((p - side1) * (p-side2) * (p - side3)));	
	}
	
	//getPerimeter
	public double getPerimeter() {
		return side1 + side2 + side3;	
	}
	
	//toString
	public String toString() {
		return "Triangle: side 1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creates a Triangle object
		Scanner input = new Scanner(System.in);
	
		double s1 = 0, s2 = 0, s3 = 0;
		String co = null;
		boolean fill = false;
		
		System.out.println("Please enter the three sides: ");
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		
		System.out.println("What color is the triangle? ");
		co = input.next();
		
		System.out.println("True or False: Is the triangle filled?");
		fill = input.nextBoolean();
		
		Triangle triangle = new Triangle(s1, s2, s3, co, fill);
		
		
		System.out.println(triangle.toString());
		System.out.println("Perimeter of Triangle: " + triangle.getPerimeter());
		System.out.println("Area of Triangle: " + triangle.getArea());
		System.out.println("Color of Triangle: " + triangle.getColor());
		System.out.println("Is the Triangle filled: " + triangle.isFilled());
		
	}
	
	

}
