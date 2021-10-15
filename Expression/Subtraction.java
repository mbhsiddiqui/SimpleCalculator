package expressions;

public class Subtraction extends Expression{
	
	protected int left;
	protected int right;
	
	Subtraction(int left, int right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}
	
	void evaluate() {
		int diff = this.left - this.right;
		super.value = diff;
	}
}
