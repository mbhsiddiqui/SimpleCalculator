package expressions;

public class DisjoinAll extends ExpressionCollector {
	void evaluate() {
		boolean result = false;
		for (Expression e: this.expressions) {
			e.evaluate();
			result = (boolean) e.getValue();
		}
		this.value = result;
	}
}
