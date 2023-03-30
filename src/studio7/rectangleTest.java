package studio7;

public class rectangleTest {
	/*
	 * R1 is the first rectangle
	 * R2 is the second rectnagle
	 */
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(2,4);
		Rectangle R2 = new Rectangle(22,24);
//		System.out.println(R1.length);
//		System.out.println(R1.width);
//		System.out.println(R1.area(R1.length,R1.width));
//		System.out.println(R1.perimeter(R1.length,R1.width));
//		R1.Draw(R1.length,R1.width);
//		StdDraw.setPenColor(0,0,200);
//		R2.Draw(R2.length,R2.width);
//		System.out.println(R1.area(R1.length,R1.width) < R2.area(R2.length,R2.width));
//		System.out.println(R1.length == R1.width);
//		System.out.println(R2.length == R2.width);
		System.out.println(R1.compareArea(R2) + ", R1 is greater than R2.");
	}

}
