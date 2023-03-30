package studio7;
import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

/*
 * 
 */
public class Rectangle {
	private double length;
	private double width;
	
/*
 *  Constructor
 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	/*
	 * param length double length of rec
	 * param width double width of rec
	 * return perimeter dbl
	 */
	public double perimeter(double length, double width) {
		return length*2+width*2;
	}
	/*
	 * param length double length of rec
	 * param width double width of rec
	 * return area dbl 
	 */
	public double area(double length, double width) {
		return length*width;
	}
	/*
	 * param length double length of rec
	 * param width double width of rec
	 * draws rectangle
	 */
	public void Draw(double length, double width) {
		StdDraw.filledRectangle(0.5, 0.5, .5*length, 0.5*width);
	}
	/*
	 * param length double length of rec
	 * param width double width of rec
	 * return boolean to check if rec is square
	 */	
	public boolean square(double length, double width) {
		if(length==width) {
			System.out.println("The rectabgle is a square.");
			return true;
		}
		return false;
	}
	
	
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	/*
	 * param length double length of rec
	 * param width double width of rec
	 * return boolean to check if R1 > R2
	 */		
	public boolean compareArea(Rectangle R2) {

		return this.area(this.length, this.width) > R2.area(R2.length, R2.width);
	}


}
