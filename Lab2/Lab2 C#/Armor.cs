using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab2_C_
{
    abstract class Armor
    {
        public string Name { get; }
        public double Weight { get; }
        public double Price { get; }

        protected Armor(string name, double weight, double price)
        {
            Name = name;
            Weight = weight;
            Price = price;
        }
        public abstract void Equip();
    }
}
