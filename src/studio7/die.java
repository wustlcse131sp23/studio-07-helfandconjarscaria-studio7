package studio7;

public class die {
	
	private int numSides;
	private String color = "blue";
	
	public die(int numSides) {
		this.numSides = numSides;
	}
	
	public int throwDie() {
		return ((int)(Math.random()*this.numSides)+1);
	}



}
