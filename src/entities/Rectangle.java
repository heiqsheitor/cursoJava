package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double areaRectangle() {
		double area = width * height;
		return area;
	}
	
	public double perimeterRectangle() {
		double perimeter = 2 * (width+height);
		return perimeter;
	}
	
	public double diagonalRectangle() {
		double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return diagonal;
	}
}
