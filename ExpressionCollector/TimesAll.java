package expressions;

public class TimesAll extends ExpressionCollector {
	void evaluate() {
		int times = 1;
		for (Expression e: this.expressions) {
			e.evaluate();
			times = times * (int) e.getValue();
		}
		this.value = times;
	}
}
