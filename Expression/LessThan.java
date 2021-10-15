package expressions;

public class LessThan extends Expression{
	
	protected int left;
	protected int right;
	
	LessThan(int left, int right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}
	
	void evaluate() {
		boolean result = this.left < this.right;
		super.value = result;
	}
}
