package expressions;

public class Addition extends Expression{
	
	protected int left;
	protected int right;
	
	Addition(int left, int right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}
	
	void evaluate() {
		int sum = this.left + this.right;
		super.value = sum;
	}
}
