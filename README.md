# SimpleCalculator

There are six kinds of (binary) expressions: addition, subtraction, multiplications, equality, greater-than, and less-than. The first three kinds are arithmetic expressions which evaluate to integers. The last three kinds are relational expressions which evaluate to Booleans (i.e., true or false). These six expression classes both inherit a more general class Expression, which maintains some basic attributes and methods that are common to all the six expressions (e.g., attributes to store operands and value, method to get value).

There are also four kinds of expression collectors, each of which collects a list of expressions:
* An add-all collector adds up the evaluation results of its collected expressions. When there are no expressions collected, the default evaluation result is 0.
* A times-all collector multiplies the evaluation results of its collected expressions. When there are no expressions collected, the default evaluation result is 1.
* A conjoin-all collector takes the conjunction (logical AND) of the evaluation results of its collected expressions. When there are no expressions collected, the default evaluation result is true.
* A disjoin-all collector takes the disjunction (logical OR) of the evaluation results of its collected expressions. When there are no expressions collected, the default evaluation result is false.
* These four classes both inherit a more general class ExpressionCollector, which maintains basic attributes and that are common to all the four collectors (e.g., the list to maintain the expression collectors, method to get result value).
