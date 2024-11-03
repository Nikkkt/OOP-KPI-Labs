using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab2_C_
{
    class Helmet : Armor
    {
        public Helmet(double weight, double price, string name) : base(name, weight, price) { }

        public override void Equip()
        {
            Console.WriteLine("You equipped the helmet");
        }
    }
}
