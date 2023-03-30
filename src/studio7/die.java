package studio7;

public class die {
	
	private int numSides;
	
	public die(int numSides) {
		this.numSides = numSides;
	}
	
	public int throwDie() {
		return ((int)(Math.random()*this.numSides)+1);
	}

	public static void main(String[] args) {
		die die1 = new die(2);
		System.out.println(die1.throwDie());

	}

}
