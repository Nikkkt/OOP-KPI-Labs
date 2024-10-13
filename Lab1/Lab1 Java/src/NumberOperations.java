import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOperations {

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<Number>(Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9));

        // Завдання
        // 1. Створіть числа різних типів
        byte num0 = 1;
        int num1 = 29;
        short num2 = 30;
        long num3 = 40L;
        float num4 = 3.1415f;
        double num5 = 14.54321;

        // 2. Долучіть їх до списку +
        // 3. Самостійно вирішіть, якого типу має бути список, щоб він містив всі різнотипні числа
        List<Number> newNumbers = Arrays.asList(num0, num1, num2, num3, num4, num5);
        numbers.addAll(newNumbers);

        // 4. Виведіть числа на екран
        System.out.print("Всі числа: ");
        System.out.println(numbers);
        System.out.println();

        // 5. Виведіть числа у форматі цілих чисел
        ArrayList<Number> intNumbers = new ArrayList<>();
        for (Number number : numbers) {
            intNumbers.add(Math.round(number.doubleValue()));
        }
        System.out.print("Округлені числа: ");
        System.out.println(intNumbers);
        System.out.println();

        // 6. Виведіть числа у форматі дробних чисел з 2ма знаками після коми (точки)
        System.out.print("Числа з 2ма знаками після коми: ");
        for (Number number : numbers) {
            System.out.print(String.format("%.2f", number.doubleValue()) + " ");
        }
        System.out.println();
        System.out.println();

        // 7. Придумайте та реалізуйте рішення, щоб зберігати числа в різних списках в
        // залежності від їх типу
        List<Integer> intList = new ArrayList<Integer>();
        List<Byte> byteList = new ArrayList<Byte>();
        List<Short> shortList = new ArrayList<Short>();
        List<Long> longList = new ArrayList<Long>();
        List<Float> floatList = new ArrayList<Float>();
        List<Double> doubleList = new ArrayList<Double>();

        for (Number number : numbers) {
            switch (number) {
                case Integer i -> intList.add((int)number);
                case Byte b -> byteList.add((byte)number);
                case Short i -> shortList.add((short)number);
                case Long l -> longList.add((long)number);
                case Float v -> floatList.add((float)number);
                case Double v -> doubleList.add((double)number);
                case null, default -> {
                    continue;
                }
            }
        }

        System.out.println(
            "Масив Int: " + intList + "\n" +
            "Масив Byte: " + byteList + "\n" +
            "Масив Short: " + shortList + "\n" +
            "Масив Long: " + longList + "\n" +
            "Масив Float: " + floatList + "\n" +
            "Масив Double: " + doubleList
        );
        System.out.println();

        // 9й варіант. Створіть новий список, де кожне число початкового списку помножене на 2
        numbers = new ArrayList<Number>(
                Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9)
        );
        ArrayList<Number> doubledNumbers = new ArrayList<>();
        for (Number number : numbers) {
            if (number instanceof Double) {
                doubledNumbers.add(number.doubleValue() * 2);
            } else {
                doubledNumbers.add(number.intValue() * 2);
            }
        }
        System.out.print("Числа помножені на 2: ");
        System.out.println(doubledNumbers);
        for (Number number : doubledNumbers) {
            System.out.print(String.format("%.2f", number.doubleValue()) + " ");
        }

        BigInteger number1 = new BigInteger("100000000000000");
        BigDecimal number2 = new BigDecimal("100000.123456789");

        BigDecimal number3 = new BigDecimal(number1);
        System.out.println(number2.add(number3));
    }
}