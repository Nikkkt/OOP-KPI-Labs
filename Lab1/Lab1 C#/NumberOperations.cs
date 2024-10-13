using System;
using System.Collections.Generic;
//using Extreme.Mathematics;
using System.Numerics;
using Extreme.Mathematics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1_C_
{
    internal class NumberOperations
    {
        static void Main(string[] args)
        {
            List<dynamic> numbers = new List<dynamic>() { 10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9 };

            // Завдання
            // 1. Створіть числа різних типів
            byte num0 = 1;
            int num1 = 29;
            short num2 = 30;
            long num3 = 40L;
            float num4 = 3.1415f;
            double num5 = 14.54321;

            // 2. Долучіть їх до списку + 3. Самостійно вирішіть, якого типу має бути список, щоб він містив всі різнотипні числа
            List<dynamic> newNumbers = new List<dynamic>() { num0, num1, num2, num3, num4, num5 };
            newNumbers.ForEach(n => numbers.Add(n));

            // 4. Виведіть числа на екран
            Console.WriteLine($"Всi числа: {String.Join("; ", numbers.ToArray())}\n");

            // 5. Виведіть числа у форматі цілих чисел
            List<dynamic> intNumbers = new List<dynamic>();
            foreach (dynamic number in numbers)
            {
                if (number is double || number is float) intNumbers.Add(Math.Round((double)number));
                else intNumbers.Add(number);
            }
            Console.WriteLine($"Округленi числа: {String.Join("; ", intNumbers.ToArray())}\n");

            // 6. Виведіть числа у форматі дробних чисел з 2ма знаками після коми (точки)
            Console.Write("Числа з 2ма знаками пiсля коми: ");
            foreach (dynamic number in numbers) Console.Write(String.Format("{0:0.00}", number) + "; ");
            Console.WriteLine("\n");

            // 7. Придумайте та реалізуйте рішення, щоб зберігати числа в різних списках в залежності від їх типу
            List<int> intList = new List<int>();
            List<byte> byteList = new List<byte>();
            List<short> shortList = new List<short>();
            List<long> longList = new List<long>();
            List<float> floatList = new List<float>();
            List<double> doubleList = new List<double>();

            foreach (dynamic number in numbers)
            {
                if (number is int) intList.Add(number);
                else if (number is byte) byteList.Add(number);
                else if (number is short) shortList.Add(number);
                else if (number is long) longList.Add(number);
                else if (number is float) floatList.Add(number);
                else if (number is double) doubleList.Add(number);
                else continue;
            }

            Console.WriteLine(
                $"Масив Int: {String.Join("; ", intList.ToArray())} \n" +
                $"Масив Byte: {String.Join("; ", byteList.ToArray())} \n" +
                $"Масив Short: {String.Join("; ", shortList.ToArray())} \n" +
                $"Масив Long: {String.Join("; ", longList.ToArray())} \n" +
                $"Масив Float: {String.Join("; ", floatList.ToArray())} \n" +
                $"Масив Double: {String.Join("; ", doubleList.ToArray())} \n"
            );

            // 9й варіант. Створіть новий список, де кожне число початкового списку помножене на 2
            numbers = new List<dynamic>() { 10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9 };
            List<dynamic> doubledNumbers = new List<dynamic>();
            foreach (dynamic number in numbers) doubledNumbers.Add(number * 2);
            Console.WriteLine($"Числа помноженi на 2: {String.Join("; ", doubledNumbers.ToArray())}");

            System.Numerics.BigInteger bigNumber = System.Numerics.BigInteger.Parse("100000000000000000000");
            ExtendedNumerics.BigDecimal bigDouble = ExtendedNumerics.BigDecimal.Parse("12345678901234567890,123456789");

            Console.WriteLine(bigNumber + bigDouble);
        }
    }
}
