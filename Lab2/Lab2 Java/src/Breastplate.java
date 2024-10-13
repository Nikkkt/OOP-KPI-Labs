public class Breastplate extends Armor {
    public Breastplate(double weight, double price, String name) {
        super(name, weight, price);
    }

    @Override
    public void equip() {
        System.out.println("You equipped the breastplate.");
    }
}
