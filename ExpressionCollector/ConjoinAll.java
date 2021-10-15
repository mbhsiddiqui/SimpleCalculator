package expressions;

public class ConjoinAll extends ExpressionCollector {
	void evaluate() {
		boolean result = true;
		for (Expression e: this.expressions) {
			e.evaluate();
			result = (boolean) e.getValue();
		}
		this.value = result;
	}
}
