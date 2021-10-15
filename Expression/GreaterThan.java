package expressions;

public class GreaterThan extends Expression{
	
	protected int left;
	protected int right;
	
	GreaterThan(int left, int right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}
	
	void evaluate() {
		boolean result = this.left > this.right;
		super.value = result;
	}
}
