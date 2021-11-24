import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    // деление не работает, вылетает ошибка ArithmeticException т.к. на ноль делить нельзя
    // BinaryOperator<Integer> devide = (x, y) -> x / y;

    BinaryOperator<Integer> devide = (x, y) -> y > 0 ? x / y : 0;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Consumer<Integer> println = System.out::println;
}