package expressions;

public class Multiplication extends Expression{
	
	protected int left;
	protected int right;
	
	Multiplication(int left, int right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}
	
	void evaluate() {
		int product = this.left * this.right;
		super.value = product;
	}
}
