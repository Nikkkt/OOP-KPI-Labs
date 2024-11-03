public class Helmet extends Armor {
    public Helmet(double weight, double price, String name) {
        super(name, weight, price);
    }

    @Override
    public void equip() {
        System.out.println("You equipped the helmet");
    }
}
