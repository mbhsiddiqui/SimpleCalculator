package expressions;

public class AddAll extends ExpressionCollector {
	void evaluate() {
		int add = 0;
		for (Expression e: this.expressions) {
			e.evaluate();
			add = add + (int) e.getValue();
		}
		this.value = add;
	}
}
