public class Main {
    public static void main(String[] args) {
        // Ініціалізація значень
        double a = 5.0;
        double b = 2.0;

        // Виклик методів для множення, додавання та ділення
        double resultMultiply = Operations.multiply(a, b);
        double resultAdd = Operations.add(a, b);
        double resultDivision = Operations.divide(resultMultiply, resultAdd);

        // Виведення результатів у консоль
        System.out.println("Result of multiplication: " + resultMultiply);
        System.out.println("Result of addition: " + resultAdd);
        System.out.println("Result of division: " + resultDivision);
    }
}