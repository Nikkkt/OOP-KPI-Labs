abstract class Armor {
    private String name;
    private double weight;
    private double price;

    public Armor(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method to be implemented by concrete armor types
    public abstract void equip();
}
