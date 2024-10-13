using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab2_C_
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Armor> armors = new List<Armor>
            {
                new Helmet(1.5, 150, "Steel Helmet"),
                new Breastplate(4.0, 250, "Iron Breastplate"),
                new Helmet(2.0, 180, "Golden Helmet"),
                new Breastplate(5.0, 300, "Diamond Breastplate"),
                new Helmet(0.8, 120, "Iron Helmet"),
                new Breastplate(1.2, 100, "Golden Breastplate")
            };

            double totalCost = armors.Sum(armor => armor.Price);
            Console.WriteLine($"Total cost of equipment: ${totalCost}");

            var sortedArmors = armors.OrderBy(armor => armor.Weight);
            foreach (var armor in sortedArmors)
            {
                PrintArmor(armor);
            }

            try
            {
                Console.Write("\nEnter minimum price: ");
                double minPrice = Convert.ToDouble(Console.ReadLine());

                Console.Write("Enter maximum price: ");
                double maxPrice = Convert.ToDouble(Console.ReadLine());

                var filteredArmors = armors
                    .Where(armor => armor.Price >= minPrice && armor.Price <= maxPrice)
                    .ToList();

                Console.WriteLine("\nArmor within the price range:");
                foreach (var armor in filteredArmors)
                {
                    PrintArmor(armor);
                }
            }
            catch (FormatException)
            {
                Console.WriteLine("Please enter valid numbers for the price.");
            }

            Console.WriteLine("\nEquipping armor:");
            foreach (var armor in armors)
            {
                armor.Equip();
            }
        }

        static void PrintArmor(Armor armor)
        {
            Console.WriteLine($"{armor.Name} (Weight: {armor.Weight} kg, Price: ${armor.Price})");
        }
    }
}
