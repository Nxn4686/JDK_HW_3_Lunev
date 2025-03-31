package Practice_3_HW_3.Task_1;

/**
 * 1.
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
 * над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
 */

public class Calculator {

    public static <T extends Number, U extends Number> double sum(T num1, U num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T num1, U num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T num1, U num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtract(T num1, U num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(5, 3.5));
        System.out.println("Multiply: " + multiply(2, 3.0));
        System.out.println("Divide: " + divide(10.0, 2));
        System.out.println("Subtract: " + subtract(7, 2.5));
    }
}

